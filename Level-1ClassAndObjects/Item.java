/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName,
 and price. Add a method to display item details and calculate the total cost 
 for a given quantity.*/
 public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: ", price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        return price * quantity;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create an instance of Item
        Item item1 = new Item("A001", "Widget", 19.99);

        // Display item details
        item1.displayItemDetails();

        // Calculate total cost for a quantity
        int quantity = 5;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total cost: ", totalCost);
    }
}