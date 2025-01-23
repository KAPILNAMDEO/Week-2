import java.util.ArrayList;
import java.util.List;

// Represents a Doctor
class Doctor {
    private String doctorName;
    private List<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Establish two-way association
        }
        System.out.println("Dr. " + doctorName + " is consulting patient " + patient.getPatientName());
    }

    public void showPatients() {
        System.out.println("Dr. " + doctorName + " has the following patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}

// Represents a Patient
class Patient {
    private String patientName;
    private List<Doctor> doctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        this.doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + patientName + " has consulted the following doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }
    }
}

// Represents a Hospital (Aggregation: Hospital has Doctors and Patients)
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }
    }

    public void showPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}

// Main class to demonstrate the functionality
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");

        // Create patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Conduct consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Add doctors and patients to the hospital (Aggregation)
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display doctor-patient relationships
        doctor1.showPatients();
        doctor2.showPatients();
        patient1.showDoctors();
        patient2.showDoctors();

        // Show all doctors and patients in the hospital
        hospital.showDoctors();
        hospital.showPatients();
    }
}

