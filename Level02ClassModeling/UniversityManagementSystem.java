
import java.util.ArrayList;
import java.util.List;

// Student Class
class Studentss {
    private String name;
    private List<Courses> courses;

    public Studentss(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  // Add student to the course
        }
    }

    public List<Courses> getCourses() {
        return courses;
    }
}

// Professor Class
class Professor {
    private String name;
    private List<Courses> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setProfessor(this);  // Set the professor for the course
        }
    }

    public List<Courses> getCourses() {
        return courses;
    }
}

// Course Class
class Courses {
    private String courseName;
    private Professor professor;
    private List<Studentss> students;

    public Courses(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.professor = null;  // Initially, no professor assigned
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Studentss> getStudents() {
        return students;
    }

    public void addStudent(Studentss student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("No professor assigned.");
        }

        System.out.println("Enrolled Students:");
        for (Studentss student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main Class (University Management System)
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Creating courses
        Courses course1 = new Courses("Introduction to Programming");
        Courses course2 = new Courses("Data Structures");

        // Assigning professors to courses
        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);

        // Creating students
        Studentss student1 = new Studentss("Pranjal");
        Studentss student2 = new Studentss("Sunny");
        Studentss student3 = new Studentss("Rimi");

        // Enrolling students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course2);

        // Display course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
