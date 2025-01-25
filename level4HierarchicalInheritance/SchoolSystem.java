package com.Day05Inheritance.level4HierarchicalInheritance;

abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public abstract void displayRole();
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject);
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Person teacher = new Teacher("Alice", 35, "Mathematics");
        Person student = new Student("Bob", 15, 10);
        Person staff = new Staff("Charlie", 40, "Administration");

        teacher.displayInfo();
        teacher.displayRole();

        student.displayInfo();
        student.displayRole();

        staff.displayInfo();
        staff.displayRole();
    }
}

