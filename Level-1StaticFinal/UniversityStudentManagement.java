class Student{
    //attributes
    private static String universityName="Rajiv Gandhi proodudiki vishwavidyalaya";
    private String name;
    private final String rollNumber;
    private char grade;
    private static  int totalStudent;

    //constructor
    Student(String name,String rollNumber,char grade ){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudent++;
    }
    //method to set university name
    static void setUniversityName(){
        System.out.println("Name of university: "+universityName);
    }
    //method to display student count
    static void  totalStudent(){

        System.out.println("Total Number of Student: "+totalStudent);
    }
    //method to displya student details
    public void displayStudentDetails(){
        System.out.println();
        System.out.println("Name of Student: "+name);
        System.out.println("Roll number of student: "+rollNumber);
        System.out.println("Grade of student: "+grade);
    }
}


public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student.setUniversityName();
        System.out.println();
        Student student1=new Student("kapil","0111AL211078",'E');
        if(student1 instanceof Student){
            System.out.println("student1 is an instance of Student Class");
        }
        student1.displayStudentDetails();
        System.out.println();
        Student student2=new Student("Yaman Mahta","0111AL211078",'E');
        if(student2 instanceof Student){
            System.out.println("student2 is an instance of Student Class");
        }

        student2.displayStudentDetails();
        System.out.println();
        Student.totalStudent();



    }
}
