package com.Day05Inheritance.level1AssistedPrograms;
//use abstract class
abstract class Employee{
    protected String name;
    protected String id;
    protected double salary ;

    protected Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name of Employee "+ name);
        System.out.println("ID of Employee"+id);
        System.out.println("salary of Employee"+salary);
    }
}
//manager extends employee
class  Manager extends Employee{
   int teamSize;
    Manager(String name,String id, double salary,int teamSize ){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
//override method
    @Override
    public void displayDetails(){
        System.out.println("Team size of Manager"+teamSize);
        System.out.println("Name of Employee "+ name);
        System.out.println("ID of Employee"+id);
        System.out.println("salary of Employee"+salary);
    }

}
//developer extends Employee
class  Developer extends Employee{
    String programmingLangauage="java";
    Developer(String name,String id, double salary,String programmingLangauage ){
        super(name, id, salary);
        this.programmingLangauage=programmingLangauage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Team size of Manager"+programmingLangauage);
        System.out.println("Name of Employee "+ name);
        System.out.println("ID of Employee"+id);
        System.out.println("salary of Employee"+salary);
    }

}
//Intern extends Employee
class  Intern extends Employee{
    double internshipDuration=2;
    Intern(String name,String id, double salary,double internshipDuration ){
        super(name, id, salary);
        this.internshipDuration=internshipDuration;
    }

    @Override
    public void displayDetails(){
        System.out.println("Team size of Manager"+internshipDuration+" months.");
        System.out.println("Name of Employee "+ name);
        System.out.println("ID of Employee"+id);
        System.out.println("salary of Employee"+salary);
    }

}


//test class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
       Employee manager=new Manager("kapil namdeo","S001",80000,2);
       manager.displayDetails();
        System.out.println();
       Employee developer=new Developer("Vidhi Jain","S002",10000.0,"java");
       developer.displayDetails();
        System.out.println();
       Employee intern=new Intern("Pranjal haswani","S003",2000.0,2.0);
       intern.displayDetails();
        System.out.println();
    }
}
