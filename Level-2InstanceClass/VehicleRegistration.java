class Vehicle {

    // Class variable (common for all vehicles)
    static double registrationFee = 100.0; // Fixed registration fee
    
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }
}
class VehicleRegistration {

    public static void main(String[] args) {
        // Create instances of the Vehicle class
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        
        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);
        
        // Display vehicle details after the update
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

