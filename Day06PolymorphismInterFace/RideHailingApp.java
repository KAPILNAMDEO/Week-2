package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;


// Abstract Vehicle Class
abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setters
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + getVehicleId());
        System.out.println("Driver Name: " + getDriverName());
        System.out.println("Rate per Km: $" + getRatePerKm());
    }
}

// Interface for GPS Functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car Class
class Cars extends Vehicles implements GPS {
    private String location;

    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 5; // Extra charge for cars
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Bike Class
class Bikes extends Vehicles implements GPS {
    private String location;

    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // No extra charges for bikes
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Auto Class
class Auto extends Vehicles implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 2; // Small extra charge for auto-rickshaws
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Utility Class for Ride Processing
class RideProcessor {
    public static void calculateRideFare(Vehicles vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: $" + vehicle.calculateFare(distance) + "\n");
    }
}

// Main Class
public class RideHailingApp {
    public static void main(String[] args) {
        Vehicles car = new Cars("C001", "John Doe", 10);
        Vehicles bike = new Bikes("B001", "Alice Smith", 5);
        Vehicles auto = new Auto("A001", "Bob Johnson", 7);

        // Calculating fares dynamically
        RideProcessor.calculateRideFare(car, 15);
        RideProcessor.calculateRideFare(bike, 10);
        RideProcessor.calculateRideFare(auto, 12);

        // Updating driver details using setters
        car.setDriverName("Jonathan Doe");
        bike.setRatePerKm(6);
        System.out.println("Updated Details:\n");
        RideProcessor.calculateRideFare(car, 15);
        RideProcessor.calculateRideFare(bike, 10);

        // Using GPS Interface Methods
        GPS gpsCar = new Cars("C002", "David Lee", 12);
        gpsCar.updateLocation("Downtown");
        System.out.println("Car Current Location: " + gpsCar.getCurrentLocation());
    }
}

