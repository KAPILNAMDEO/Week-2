class Student {
    public int rollNumber; // Public attribute
    protected String name;  // Protected attribute
    private double CGPA;    // Private attribute

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA); // Use setter to initialize CGPA
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 4.0) { // Assuming CGPA is on a scale of 0 to 4
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It must be between 0.0 and 4.0.");
        }
    }
}
class PostgraduateStudent extends Student {
    private String thesisTitle; // Private attribute for thesis title

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA); // Call the constructor of the superclass
        this.thesisTitle = thesisTitle;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("CGPA: " + getCGPA()); // Accessing CGPA using getter
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a PostgraduateStudent object
        PostgraduateStudent student = new PostgraduateStudent(101, "Alice", 3.8, "AI in Healthcare");

        // Display student details
        student.displayDetails();

        // Modify CGPA
        student.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Attempt to set an invalid CGPA
        student.setCGPA(4.5); // Should print an error message
    }
}