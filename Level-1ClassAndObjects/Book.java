/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes 
title, author, and price. Add a method to display the book details.*/
class Book{
    //define attribute 
    private String title;
    private String author;
    private int price;
    //create contructor
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //method to display book details
    void displayBookDeatils(){
        System.out.println("Title of Book: "+title);
        System.out.println("Author of Book: "+author);
        System.out.println("Pirce of the Book: "+price);
    }
    public static void main(String args[]){
        Book book=new Book("Compute Sceince ","Sumita arora", 589 ) ;
        book.displayBookDeatils();
    }

}
