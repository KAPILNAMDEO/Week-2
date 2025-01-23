import java.util.ArrayList;
import java.util.List;

// Represents a Course
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);  // Establish two-way association
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getStudentName());
        }
    }
}

// Represents a Student
class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewEnrolledCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

// Represents a School (Aggregation: School has Students)
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}

// Main class to demonstrate the functionality
public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        math.enrollStudent(student1);
        science.enrollStudent(student1);
        science.enrollStudent(student2);

        // Add students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Display student enrollments
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        // Display course enrollments
        math.showEnrolledStudents();
        science.showEnrolledStudents();

        // Show students in the school
        school.showStudents();
    }
}

