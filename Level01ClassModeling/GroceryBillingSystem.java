package Level1ClassModeling;


import java.util.ArrayList;
import java.util.List;

// Represents a Product
class Product {
    private String productName;
    private double unitPrice;
    private double quantity;

    public Product(String productName, double unitPrice, double quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    public String toString() {
        return productName + " (" + quantity + " units at $" + unitPrice + " each)";
    }
}

// Represents a Customer
class Customer {
    private String customerName;
    private List<Product> products;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Bill Generator Class
class BillGenerator {
    public static double calculateTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public static void printBill(Customer customer) {
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Purchased Items:");
        for (Product product : customer.getProducts()) {
            System.out.println("- " + product);
        }
        System.out.println("Total Bill: $" + calculateTotal(customer));
    }
}

// Main Class to Demonstrate Functionality
public class GroceryBillingSystem {
    public static void main(String[] args) {
        // Create customer
        Customer customer = new Customer("Alice");

        // Add purchased products
        customer.addProduct(new Product("Apples", 3, 2));
        customer.addProduct(new Product("Milk", 2, 1));

        // Generate and print bill
        BillGenerator.printBill(customer);
    }
}

