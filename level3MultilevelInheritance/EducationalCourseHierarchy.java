package com.Day05Inheritance.level3MultilevelInheritance;


// Base class Course
class Course {
    protected String courseName;
    protected int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// OnlineCourse extends Course
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {

        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {

        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Test class...
public class EducationalCourseHierarchy{
    public static void main(String[] args) {
        Course freeCourse = new Course("Java Basics", 4);
        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", 6, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 8, "Coursera", false, 199.99, 20);

        Course[] courses = {freeCourse, onlineCourse, paidCourse};

        for (Course course : courses) {
            course.displayInfo();
            System.out.println();
        }
    }
}
