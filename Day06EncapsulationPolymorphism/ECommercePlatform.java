package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;
// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
    }

    public double calculateFinalPrice() {
        double tax = this instanceof Taxable ? ((Taxable) this).calculateTax() : 0;
        return getPrice() + tax - calculateDiscount();
    }
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax
    }

    @Override
    public String getTaxDetails() {
        return "Tax: 15%";
    }
}

// Clothing class
class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(101, "Laptop", 80000),
                new Clothing(102, "T-Shirt", 1500),
                new Groceries(103, "Apples", 200)
        };

        for (Product product : products) {
            product.displayDetails();
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("Final Price: " + product.calculateFinalPrice());
            System.out.println("--------------------");
        }
    }
}

