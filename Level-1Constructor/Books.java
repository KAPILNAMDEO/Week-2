/*Create a Book class with attributes title, author, and price. Provide both default and
 parameterized constructors.*/
// creating subclass
 class Book{
    //define attributes in class
    String title;
    String author;
    double price;
    Book(){
        //set details of book in default constructor
        this.title="Java Full Stack";
        this.author="Ravi Kant Soni";
        this.price=358.0;

    }
    //use parameter constructor
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //method to display details of the books
    void display(){
        System.out.println("\nTitle of the book: "+title);
        System.out.println("Author of these book:"+author);
        System.out.println("Price of "+title+" is "+price);
    }
 }
 //public class 
 public class Books{
    public static void main(String[] args) {
        Book book1=new Book();
        book1.display();
        Book book2=new Book("Full Stack Web Devlopment","R.S. Agrawal",785.0);
        book2.display();
        
    }
 }