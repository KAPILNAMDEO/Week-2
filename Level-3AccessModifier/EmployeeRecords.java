class Employee {
    public String employeeID; // Public attribute
    protected String department; // Protected attribute
    private double salary; // Private attribute

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary); // Use setter to initialize salary
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) { // Ensure salary is not negative
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. It cannot be negative.");
        }
    }
}
class Manager extends Employee {
    private String title; // Private attribute for manager's title

    // Constructor
    public Manager(String employeeID, String department, double salary, String title) {
        super(employeeID, department, salary); // Call the constructor of the superclass
        this.title = title;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public attribute
        System.out.println("Department: " + department); // Accessing protected attribute
        System.out.println("Salary: " + getSalary()); // Accessing salary using getter
        System.out.println("Title: " + title);
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("E123", "Sales", 75000.0, "Sales Manager");

        // Display manager details
        manager.displayManagerDetails();

        // Modify the salary
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());

        // Attempt to set an invalid salary
        manager.setSalary(-5000.0); // Should print an error message
    }
}