package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;


abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + getItemName());
        System.out.println("Price per item: $" + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}

// Interface for discounts
interface Discountable {
    double applyDiscount(double percentage);
    void getDiscountDetails(double percentage);
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double percentage) {
        return calculateTotalPrice() * (1 - percentage / 100);
    }

    @Override
    public void getDiscountDetails(double percentage) {
        System.out.println("Veg item '" + getItemName() + "' has a discount of " + percentage + "%.");
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 2.0; // Additional charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + ADDITIONAL_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount(double percentage) {
        return calculateTotalPrice() * (1 - percentage / 100);
    }

    @Override
    public void getDiscountDetails(double percentage) {
        System.out.println("Non-veg item '" + getItemName() + "' has a discount of " + percentage + "%.");
    }
}

// Order Processor
class OrderProcessor {
    public static void processOrder(FoodItem food) {
        food.getItemDetails();
        System.out.println("Total Price: $" + food.calculateTotalPrice() + "\n");
    }
}

// Main Class
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        FoodItem vegBurger = new VegItem("Veg Burger", 5.99, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 12.99, 1);

        // Processing Orders
        OrderProcessor.processOrder(vegBurger);
        OrderProcessor.processOrder(chickenPizza);

        // Applying Discounts
        Discountable discountedVeg = new VegItem("Pasta", 8.99, 1);
        discountedVeg.getDiscountDetails(10);
        System.out.println("Price after discount: $" + discountedVeg.applyDiscount(10) + "\n");

        Discountable discountedNonVeg = new NonVegItem("Grilled Chicken", 15.99, 2);
        discountedNonVeg.getDiscountDetails(15);
        System.out.println("Price after discount: $" + discountedNonVeg.applyDiscount(15));
    }
}

