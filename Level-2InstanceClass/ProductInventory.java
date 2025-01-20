import java.util.*;

class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    // Constructor
    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 699.49);
        
        // Display individual product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();
        
        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();
        
        // Display total products created
        Product.displayTotalProducts();
    }
}
