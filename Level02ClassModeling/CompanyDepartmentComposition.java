import java.util.ArrayList;
import java.util.List;

class Employee {
    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void deleteCompany() {
        // Explicitly clearing references to demonstrate deletion
        departments.clear();
        System.out.println("Company and all associated departments and employees deleted.");
    }
}

public class CompanyDepartmentComposition {
    public static void main(String[] args) {
        Company myCompany = new Company("TechCorp");
        myCompany.addDepartment("IT");
        myCompany.addDepartment("HR");

        myCompany.getDepartments().get(0).addEmployee("Alice");
        myCompany.getDepartments().get(0).addEmployee("Bob");
        myCompany.getDepartments().get(1).addEmployee("Charlie");

        // Deleting company (composition ensures departments and employees don't exist separately)
        myCompany.deleteCompany();
    }
}


