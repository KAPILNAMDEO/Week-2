package com.Day05Inheritance.level2SingleInheritance;
//superClass
class Book {

    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }

    public int getPublicationYear(){
        return  publicationYear;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
//subclass of book
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
//test class
public class LibraryManagement {
    public static void main(String[] args) {
        Book author = new Author("Java Programming", 2021, "John Doe", "Expert in Java and Software Development.");
        author.displayInfo();
    }
}

