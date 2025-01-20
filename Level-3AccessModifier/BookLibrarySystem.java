class Book {
    public String ISBN; // Public attribute
    protected String title; // Protected attribute
    private String author; // Private attribute

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author); // Use setter to initialize author
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }
}
class EBook extends Book {
    private double fileSize; // Private attribute for file size

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the constructor of the superclass
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public attribute
        System.out.println("Title: " + title); // Accessing protected attribute
        System.out.println("Author: " + getAuthor()); // Accessing private attribute via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create an EBook object
        EBook eBook = new EBook("978-3-16-148410-0", "Effective Java", "Joshua Bloch", 1.5);

        // Display eBook details
        eBook.displayDetails();

        // Modify the author name
        eBook.setAuthor("Updated Author");
        System.out.println("Updated Author: " + eBook.getAuthor());
    }
}