/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with 
default and user-provided values.*/
import java.util.*;
class Circle{
    double radius;
    //default constructor
    Circle(){
        this.radius=6.5;
    }
    //parameter constructor
    Circle(double radius){
        this.radius=radius;
    }
    //method to display circle radius and area
    void display(){
        System.out.println("Radius of circle: "+radius);
        System.out.println("Area of circle: "+3.14*radius*radius);
    }
}

public class Circles{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();//taking user input

        Circle circle1=new Circle();//call default constructor
        circle1.display();

        Circle circle2=new Circle(radius);//call parameter constructor
        circle2.display();
        



    }
}