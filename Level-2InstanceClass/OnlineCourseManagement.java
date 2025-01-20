public class OnlineCourseManagement {

    // Course class inside OnlineCourseManagement
    static class Course {
        // Class variable (common for all courses)
        static String instituteName = "Default Institute";
        
        // Instance variables
        private String courseName;
        private int duration; // in months
        private double fee;
        
        // Constructor to initialize instance variables
        public Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }
        
        // Instance method to display course details
        public void displayCourseDetails() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " months");
            System.out.println("Fee: $" + fee);
            System.out.println("Institute: " + instituteName);
        }
        
        // Class method to update the institute name for all courses
        public static void updateInstituteName(String newInstituteName) {
            instituteName = newInstituteName;
            System.out.println("Institute name updated to: " + instituteName);
        }
    }

    public static void main(String[] args) {
        // Create instances of the Course class
        Course course1 = new Course("Java Programming", 6, 500);
        Course course2 = new Course("Data Science", 12, 1200);
        
        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        
        // Update the institute name for all courses
        Course.updateInstituteName("Tech Academy");
        
        // Display course details after the update
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
