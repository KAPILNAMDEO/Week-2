package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;
abstract class LibraryItem{
    private String itemid;
    private String title;
    private String author;
    private String borrower;
    public LibraryItem(String itemid,String title,String author){
        this.itemid=itemid;
        this.title=title;
        this.author=author;
    }
    //use getter
    public String getTitle(){
        return title;
    }
    public String getItemid(){
        return itemid;
    }
    public String getAuthor(){
        return author;
    }

    public String getBorrower(){
        return borrower;
    }
    public void setBorrower(String borrower){
        this.borrower=borrower;
    }
    //use abstract class to hide the data
    public abstract int getLoanDuration();
    public void getItemDetails(){
        System.out.println("Details of the books: ");
        System.out.println("Item ID of book: "+getItemid());
        System.out.println("Title of the Book: "+getTitle());
        System.out.println("Author Of the Book: "+getAuthor());
        System.out.println("Borrower: " + (getBorrower() != null ? getBorrower() : "Not Borrowed"));
    }
}
//use interface
interface Reservable{
    public void reserveItem();
    public void checkAvailabilty();
}
//subclass Magazine of LibraryItem
class Magazine extends LibraryItem implements Reservable{
    public Magazine(String itemId,String title,String author){
        super(itemId,title,author);
    }
    public void reserveItem(){
        System.out.println("Magazine"+ getTitle()+ " reserved.");
    }
    public void checkAvailabilty(){
        System.out.println("Magazine"+ getTitle()+ " is Available.");
    }
    public int getLoanDuration(){
        return 7;
    }

}
//subclass Book of LibraryItem
class Book extends LibraryItem implements Reservable{
    Book(String itemId,String title,String author) {
        super(itemId,title,author);
    }
    public void reserveItem(){
        System.out.println("Book '" + getTitle() + "' reserved.");
    }
    public void checkAvailabilty(){
        System.out.println("Book '" + getTitle() + "' is Available.");
    }
    public int getLoanDuration(){
         return 14;
    }

}
//subclass DVD of LibraryItem
class DVD extends LibraryItem implements Reservable{
    DVD(String itemId,String title,String author) {
        super(itemId,title,author);
    }
    public void reserveItem(){
        System.out.println("DVD '" + getTitle() + "' reserved.");
    }
    public void checkAvailabilty(){
        System.out.println("DVD '" + getTitle() + "' is available.");
    }
    public int  getLoanDuration(){
        return 5;
    }

}
//Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B001", "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine("M001", "National Geographic", "Various");
        LibraryItem item3 = new DVD("D001", "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days\n");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days\n");


        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days\n");

        Reservable res1 = new Book("B002", "1984", "George Orwell");
        res1.reserveItem();
        res1.checkAvailabilty();
    }
}
