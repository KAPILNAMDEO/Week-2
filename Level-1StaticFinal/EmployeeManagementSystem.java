class Employee{
    private static String companyName="CAPGEMINI";//use static for company name
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees=0;
    Employee(String name,int id,String designation){//constructor
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;

    }
    public static void  displayCompanyName(){//use static to display company name
        System.out.println("Company Name:  "+companyName);
    }
    public void displayEmployeeDetails(){//method to display details of employee
        System.out.println("Name of Employee: "+name);
        System.out.println("ID of Employee: "+id);
        System.out.println("Designation of Employee: "+designation);
        System.out.println();
        System.out.println("Total employee: "+totalEmployees);
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee.displayCompanyName();
        System.out.println();

        Employee employee1=new Employee("Kapil Namdeo",122,"Data analyst");
        if(employee1 instanceof Employee){
            System.out.println("employee1 is an instance of Employee");
        }
        employee1.displayEmployeeDetails();
        System.out.println();
        Employee employee2=new Employee("Pranjal Haswani",123,"HR");
        if(employee2 instanceof Employee){
            System.out.println("employee2 is an instance of Employee");

        }
        employee2.displayEmployeeDetails();
    }


}
