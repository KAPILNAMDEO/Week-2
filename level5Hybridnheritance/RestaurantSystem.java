package com.Day05Inheritance.level5Hybridnheritance;

/*
 * Abstract superclass representing a person in the restaurant system.
 * Contains common attributes like name and ID.
 */
abstract class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic information about the person
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

/*
 * Interface representing a worker in the restaurant system.
 * Requires implementing classes to define performDuties().
 */
interface Worker {
    void performDuties();
}

/*
 * Class representing a Chef, inheriting from Person and implementing Worker.
 * Includes a specialty attribute and a specific implementation of performDuties().
 */
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println(name + " is a Chef who specializes in " + specialty + " and prepares meals.");
    }
}

/*
 * Class representing a Waiter, inheriting from Person and implementing Worker.
 * Includes a section attribute and a specific implementation of performDuties().
 */
class Waiter extends Person implements Worker {
    private String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println(name + " is a Waiter responsible for serving customers in " + section + " section.");
    }
}

/*
 * Main class to demonstrate the functionality of the restaurant system.
 */
public class RestaurantSystem {
    public static void main(String[] args) {
        // Creating a Chef and a Waiter instance
        Worker chef = new Chef("Gordon", 101, "Italian Cuisine");
        Worker waiter = new Waiter("John", 202, "Outdoor");

        // Performing duties of each worker
        chef.performDuties();
        waiter.performDuties();
    }
}


