package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;



// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
        System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
    }
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% insurance charge
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 5% of rental rate";
    }
}

// Bike class
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% surcharge for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% insurance charge
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 10% of rental rate";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("C101", 1000),
                new Bike("B202", 500),
                new Truck("T303", 2000)
        };

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(rentalDays);
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
            }
            System.out.println("--------------------");
        }
    }
}

