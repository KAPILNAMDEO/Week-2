// Product class to manage shopping cart items
class Product {
    // Static variable to hold the discount shared by all products
    static double discount;

    // Final variable to store the product ID, which cannot be changed
    final int productID;

    // Instance variables for product details
    String productName;
    double price;
    int quantity;

    // Constructor to initialize the product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Instance method to calculate the total price after applying the discount
    public double getTotalPrice() {
        return price * quantity * (1 - discount / 100);
    }

    // Static method to display product details
    public static void displayProductDetails(Product product) {
        if (product instanceof Product) {
            System.out.println("Product ID: " + product.productID);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Price: " + product.price);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Total Price after Discount: " + product.getTotalPrice());
        } else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }


}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create a product with a unique ID, name, price, and quantity
        Product product1 = new Product(101, "Laptop", 50000, 2);

        // Update the discount to 10%
        Product.updateDiscount(10);

        // Display product details using the static method
        Product.displayProductDetails(product1);
    }
}

