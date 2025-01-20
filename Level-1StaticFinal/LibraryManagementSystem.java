class Book{
    private static String libraryName= "Namdeo Library";//use static keyword for library
    private String title;
    private String author;
    private final String isbn;

    Book(String title,String author,String isbn){//constructor
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public static void displayLibraryName(){//use static method to display library name
        System.out.println("Library Name: "+libraryName);
    }
    public void displayBookDeatils(){//methoid to display book details
        System.out.println("Title of the Book: "+title);
        System.out.println("Author of these Book"+author);
        System.out.println("ISBN Number: "+isbn);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();
        System.out.println();


        Book book1=new Book("JAVA full Stack","RS Agrawal","012A5A");
        if(book1 instanceof Book){//to check instance of ab object
            System.out.println("book1 is an instance of Book");
        }
        book1.displayBookDeatils();//call method
        System.out.println();

        Book book2=new Book("WEB DEVLOPMENT","KK NAMDEO","012A5A");
        if(book2 instanceof Book){
            System.out.println("book2 is an instance of Book");
        }
        book2.displayBookDeatils();




    }
}
