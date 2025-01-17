/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes
 name, id, and salary. Add a method to display the details.*/
 public class EmployeeDetail {
    private String name;
    private int id;
    private int salary;
    EmployeeDetail(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name of emplyoee: "+name);
        System.out.println("ID of employee: "+id);
        System.out.println("Salary of Employee: "+salary);
          
    }
    public static void main(String[] args) {
        EmployeeDetail employeeDetail=new EmployeeDetail("kapil",101,10000);
        employeeDetail.display();
    }
    
    
 }