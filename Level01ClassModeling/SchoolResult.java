package Level1ClassModeling;


import java.util.ArrayList;
import java.util.List;

// Represents a Subject
class Subject {
    private String subjectName;
    private int score;

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }
}

// Represents a Student
class Student {
    private String studentName;
    private List<Subject> subjects;

    public Student(String studentName) {
        this.studentName = studentName;
        this.subjects = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

// Grade Calculator Class
class GradeCalculator {
    public static double calculateAverage(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) return 0;

        int totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        return (double) totalScore / subjects.size();
    }

    public static String determineGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
}

// Main Class to Demonstrate Functionality
public class SchoolResult {
    public static void main(String[] args) {
        // Create student
        Student student = new Student("John Doe");

        // Add subjects and scores
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 92));
        student.addSubject(new Subject("History", 78));

        // Calculate and display results
        double average = GradeCalculator.calculateAverage(student);
        String grade = GradeCalculator.determineGrade(average);

        System.out.println("Student: " + student.getStudentName());
        System.out.println("Average Score: " + average);
        System.out.println("Final Grade: " + grade);
    }
}

