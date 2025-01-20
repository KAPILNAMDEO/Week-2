class Book {
    //attributes
    private String title;
    private String author;
    private double price;
    private boolean available;
    //parameter constructor
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    //method to check availability
    String borrowBook() {
        if (available) {
            available = false;
            return "You have borrowed \"" + title + "\" by " + author + ".";
        } else {
            return "Sorry, \"" + title + "\" is currently not available.";
        }
    }
    //method to return status and details of books
    @Override
    public String toString() {
        String status = available ? "Available" : "Not Available";
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Status: " + status;
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        System.out.println(book1);
        System.out.println(book1.borrowBook());
        System.out.println(book1);
    }
}
