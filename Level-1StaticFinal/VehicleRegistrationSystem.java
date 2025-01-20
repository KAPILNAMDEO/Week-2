class Vehicle {
    // Static variable for registration fee, shared by all vehicles
    static double registrationFee = 500.0;

    // Final variable for registration number, once set cannot be changed
    final String registrationNumber;

    // Instance variables for owner name and vehicle type
    String ownerName;
    String vehicleType;

    // Constructor to initialize owner name, vehicle type, and registration number
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display registration details
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Method to check if an object is of type Vehicle
    public static void checkVehicleType(Object obj) {
        if (obj instanceof Vehicle) {
            ((Vehicle) obj).displayRegistrationDetails();
        } else {
            System.out.println("The object is not a Vehicle.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create a new vehicle object
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "ABC123");

        // Update registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Check if the object is of type Vehicle and display details
        Vehicle.checkVehicleType(vehicle1);

        // Create another object that is not of type Vehicle
        String notAVehicle = "Not a Vehicle";
        Vehicle.checkVehicleType(notAVehicle);
    }
}

