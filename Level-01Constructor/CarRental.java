import java.util.*;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Assigned";
        this.rentalDays = 0;
        this.dailyRate = 50.0; // Default rate per day
    }

    // Parameterized Constructor
    public CarRental(String name, String model, int days, double rate) {
        this.customerName = name;
        this.carModel = model;
        this.rentalDays = days;
        this.dailyRate = rate;
    }

    // Copy Constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    // Function to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Function to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Default Constructor Example:\n");
        rental1.displayRentalDetails();
        System.out.println();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("John Doe", "Toyota Camry", 5, 60.0);
        System.out.println("Parameterized Constructor Example:\n");
        rental2.displayRentalDetails();
        System.out.println();

        // Using copy constructor
        CarRental rental3 = new CarRental(rental2);
        System.out.println("Copy Constructor Example:\n");
        rental3.displayRentalDetails();
    }
}
