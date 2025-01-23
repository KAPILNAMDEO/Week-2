import java.util.ArrayList;

// Faculty class (aggregation relationship)
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// Department class (composition relationship)
class Departments {
    private String name;

    // Constructor
    public Departments(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// University class
class University {
    private String name;
    private ArrayList<Departments> departments;
    private ArrayList<Faculty> faculties;

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department (composition)
    public void addDepartment(Departments department) {
        departments.add(department);
    }

    // Add a faculty member (aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display departments
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Departments department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    // Display faculty members
    public void displayFaculties() {
        System.out.println("Faculty members associated with " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Delete university (composition relationship)
    public void deleteUniversity() {
        System.out.println("Deleting university " + name + "...");
        departments.clear(); // All departments are deleted
        System.out.println("All departments removed.");
    }
}

// Main class
public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        // Create university
        University university = new University("Tech University");

        // Create departments
        Departments dept1 = new Departments("Computer Science");
        Departments dept2 = new Departments("Electrical Engineering");

        // Add departments to university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        // Add faculty members to university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display information
        university.displayDepartments();
        university.displayFaculties();

        // Delete university
        university.deleteUniversity();

        // Try displaying departments again (should be empty)
        university.displayDepartments();
    }
}