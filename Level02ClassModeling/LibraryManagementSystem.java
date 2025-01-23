
import java.util.ArrayList;
import java.util.List;

class Library {
    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getBookTitle() + "' has been added to " + libraryName);
    }

    public void showBooks() {
        System.out.println("Books present in library " + libraryName + " :");
        for (Book book : books) {
            System.out.println(" - " + book.getBookTitle() + " by " + book.getAuthor());
        }
    }
}

class Book {
    private String bookTitle;
    private String author;

    public Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        // Demonstrating aggregation
        library2.addBook(book1);

        library1.showBooks();
        library2.showBooks();
    }
}
