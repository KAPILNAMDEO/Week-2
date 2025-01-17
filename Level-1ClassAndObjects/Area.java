/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute
 radius. Add methods to calculate and display the area and circumference of
  the circle.*/
  class Circle{
    //creating attributes
    private double radius;
    //contructor
    Circle(double radius){
        this.radius=radius;

    }
    //make a method to display result
    void displayAreaOfCircumference(){
        double areaOfCircle=3.14*radius*radius;
        double circumeferenceOfCircle=2*3.14*radius;
        System.out.println("Area of circumeference: "+areaOfCircle);
        System.out.println("Circumference of circle"+circumeferenceOfCircle);

    }
    public static void main(String[] args) {
        Circle circle=new Circle(15);
        circle.displayAreaOfCircumference();
    }
  }