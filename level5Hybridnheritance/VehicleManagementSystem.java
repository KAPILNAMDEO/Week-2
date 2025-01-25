package com.Day05Inheritance.level5Hybridnheritance;


// Superclass Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface Refuelable
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass PetrolVehicle implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

// Main class to demonstrate functionality
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle(200, "Tesla Model 3");
        PetrolVehicle honda = new PetrolVehicle(180, "Honda Civic");

        // Display vehicle info
        tesla.displayInfo();
        honda.displayInfo();

        // Specific behavior
        tesla.charge();
        honda.refuel();
    }
}

