package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;



// Abstract Patient Class
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;

    public Patient(String patientId, String name, int age, String diagnosis, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient Class (Hospitalized Patients)
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private String medicalRecord = "";

    public InPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    // Getters
    public double getDailyCharge() {
        return dailyCharge;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    // Setters
    public void setDailyCharge(double dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        this.medicalRecord += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":\n" + medicalRecord);
    }
}

// OutPatient Class (Non-Hospitalized Patients)
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicationCost;
    private String medicalRecord = "";

    public OutPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double consultationFee, double medicationCost) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.consultationFee = consultationFee;
        this.medicationCost = medicationCost;
    }

    // Getters
    public double getConsultationFee() {
        return consultationFee;
    }

    public double getMedicationCost() {
        return medicationCost;
    }

    // Setters
    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public void setMedicationCost(double medicationCost) {
        this.medicationCost = medicationCost;
    }

    @Override
    public double calculateBill() {
        return consultationFee + medicationCost;
    }

    @Override
    public void addRecord(String record) {
        this.medicalRecord += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":\n" + medicalRecord);
    }
}

// Utility Class for Processing Patients
class PatientProcessor {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: $" + patient.calculateBill() + "\n");
    }
}

// Main Class
public class HospitalManagement {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("P1001", "John Doe", 45, "Pneumonia", "Asthma history", 200, 5);
        OutPatient outPatient = new OutPatient("P2001", "Alice Smith", 30, "Migraine", "No major history", 100, 50);

        // Processing Patients
        PatientProcessor.processPatient(inPatient);
        PatientProcessor.processPatient(outPatient);

        // Updating Details Using Setters
        inPatient.setName("Jonathan Doe");
        inPatient.setDiagnosis("Severe Pneumonia");
        inPatient.setDailyCharge(220);
        inPatient.setDaysAdmitted(6);
        System.out.println("\nUpdated InPatient Details:");
        PatientProcessor.processPatient(inPatient);

        outPatient.setMedicalHistory("Chronic Migraines");
        outPatient.setConsultationFee(120);
        System.out.println("\nUpdated OutPatient Details:");
        PatientProcessor.processPatient(outPatient);

        // Adding and Viewing Medical Records
        MedicalRecord record1 = new InPatient("P1002", "Mike Johnson", 55, "Diabetes", "Heart disease history", 250, 4);
        record1.addRecord("Prescribed insulin therapy.");
        record1.addRecord("Blood sugar level monitoring required.");
        record1.viewRecords();

        MedicalRecord record2 = new OutPatient("P2002", "Sophia Brown", 27, "Cold & Flu", "Allergic to penicillin", 80, 20);
        record2.addRecord("Prescribed antihistamines.");
        record2.viewRecords();
    }
}

