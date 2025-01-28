package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;
//abstract  base class
abstract class Employee{
    private String employeeId;
    private String name;
    private double baseSalary;
    //constructor
    public Employee(String employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    //use getter and settle method to access data into other classes
    public String getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    //use abstract method
    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Details of Employees:");
        System.out.println("Employee Id: "+getEmployeeId());
        System.out.println("Employee name: "+getName());
        System.out.println("Employee base Salary: "+getBaseSalary());
        System.out.println("Total Salary: "+calculateSalary());
    }
}
//interface
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

//subclass extends super class and implement department...
class FullTimeEmployee extends  Employee implements Department{
    private String department;
    public FullTimeEmployee(String employeeId,String name,double baseSalary){
        super(employeeId,name,baseSalary);
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary();
    }
    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    @Override
    public String getDepartmentDetails(){
        return "Department"+department;
    }
}

//subclass extends super class and implement department...
class PartTimeEmployee extends  Employee implements Department{
    private String department;
    private int workHour;
    private double hourlyRate;
    public PartTimeEmployee(String employeeId,String name,double hourlyRate,int workHour){
        super(employeeId,name,0);
        this.hourlyRate=hourlyRate;
        this.workHour=workHour;
    }

    public double calculateSalary(){
        return workHour*hourlyRate;
    }
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }

}

//main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("S1021","Kapil Namdeo",5000.0);
        fullTimeEmployee.assignDepartment("HR");

        PartTimeEmployee partTimeEmployee=new PartTimeEmployee("S1214","Pranjal Haswani",20.2,120);
        partTimeEmployee.assignDepartment("IT");

        fullTimeEmployee.displayDetails();
        System.out.println(fullTimeEmployee.getDepartmentDetails());
        System.out.println("---------------");


        partTimeEmployee.displayDetails();
        System.out.println(partTimeEmployee.getDepartmentDetails());
        System.out.println("---------------");
    }
}
