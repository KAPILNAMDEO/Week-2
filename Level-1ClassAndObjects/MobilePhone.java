/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, 
and price. Add a method to display all the details of the phone. The 
MobilePhone class uses attributes to store the phone's characteristics. 
The method is used to retrieve and display this information for each object.*/
public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all details of the phone
    public void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: ", price);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create an instance of MobilePhone
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S22", 799.99);
        MobilePhone phone3 = new MobilePhone("Google", "Pixel 7", 599.99);

        // Display details of each phone
        System.out.println("Mobile Phone Details:");
        phone1.displayPhoneDetails();
        System.out.println(); // Print a blank line for better readability
        phone2.displayPhoneDetails();
        System.out.println(); // Print a blank line for better readability
        phone3.displayPhoneDetails();
    }
}