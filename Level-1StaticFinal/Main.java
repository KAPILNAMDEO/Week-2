import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Outer {



      static class Inner {
         static  void display() {

            System.out.println("Static nested class");
        }
          static void print(){
              System.out.println("yes");
          }
    }
}


public class Main {
    public static void main(String[] args) {
       Outer.Inner.display();
       Outer.Inner.print();
    }
}


