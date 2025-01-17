/*Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, 
and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student 
as attributes. Methods are used to calculate the grade and provide a way to
 display all information.*/
 class Student{
    //define attributes
    private String name;
    private int rollNumber;
    private int marks;
    //contructor
    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    //method to calculate grade
    char calculateGrade(int  marks){
        char grade;
        if(marks>90){
            grade='A';
        }
        else if(marks>80 && marks<=90){
            grade='B';
        }
        else if(marks>70 && marks<=80){
            grade='C';
        }
        else if(marks>60 && marks<=70){
            grade='D';
        }
        else{
            grade='E';
        }
        return grade;


    }
    //method to display result
    void displayResult(char grade){
        System.out.println("Name of the Student: "+name);
        System.out.println("Roll number of Student : "+rollNumber);
        System.out.println("Marks of Student: "+marks);
        System.out.println("Grade of Student: "+ grade);
    }
    public static void main(String args[]){
        Student student=new Student("kapil",101,64);
        char grade=student.calculateGrade(64);
        student.displayResult(grade);

    }


 }