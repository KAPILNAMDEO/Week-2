class Patient {
    // Static variable for hospital name, shared by all patients
    static String hospitalName = "City Health Hospital";

    // Static variable to count the total number of patients admitted
    static int totalPatients = 0;

    // Final variable for patient ID, which uniquely identifies each patient
    final String patientID;

    // Instance variables for patient details
    String name;
    int age;
    String ailment;

    // Constructor to initialize name, age, and ailment, and generate a unique patient ID
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;

        // Generate unique patient ID
        this.patientID = "PID" + (++totalPatients);
    }

    // Static method to get the total number of patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }

    // Method to check if an object is of type Patient
    public static void checkPatientType(Object obj) {
        if (obj instanceof Patient) {
            ((Patient) obj).displayPatientDetails();
        } else {
            System.out.println("The object is not a Patient.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create new patient objects
        Patient patient1 = new Patient("Alice", 30, "Fever");
        Patient patient2 = new Patient("Bob", 45, "Cough");

        // Check total patients admitted
        System.out.println("Total Patients: " + Patient.getTotalPatients());

        // Display details of the patient
        Patient.checkPatientType(patient1);
        Patient.checkPatientType(patient2);

        // Create another object that is not a Patient
        String notAPatient = "Not a Patient";
        Patient.checkPatientType(notAPatient);
    }
}

