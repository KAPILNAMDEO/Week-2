package com.Day05Inheritance.level1AssistedPrograms;

// Use abstract class
abstract class Vehicle {
    private float maxSpeed;
    private String fuelType;

    Vehicle(float maxSpeed, String fuelType) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }

    // Getter methods
    public float getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public abstract void displayInfo();
}

// Car extends Vehicle
class Car extends Vehicle {
    private int seatCapacity;

    Car(float maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name of vehicle: Car");
        System.out.println("Speed of car: " + getMaxSpeed() + " km/h");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Seat capacity: " + seatCapacity);
    }
}

// Truck extends Vehicle
class Truck extends Vehicle {
    private int loadCapacity;

    Truck(float maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name of vehicle: Truck");
        System.out.println("Speed of truck: " + getMaxSpeed() + " km/h");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Load capacity: " + loadCapacity + " tons");
    }
}

// Motorcycle extends Vehicle
class Motorcycle extends Vehicle {
    private double fuelCapacity;

    Motorcycle(float maxSpeed, String fuelType, double fuelCapacity) {
        super(maxSpeed, fuelType);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name of vehicle: Motorcycle");
        System.out.println("Speed of motorcycle: " + getMaxSpeed() + " km/h");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Fuel capacity: " + fuelCapacity + " liters");
    }
}

// Test class
public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(250, "Petrol", 5),
                new Truck(150, "Diesel", 10),
                new Motorcycle(180, "Electrical", 15.5)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}