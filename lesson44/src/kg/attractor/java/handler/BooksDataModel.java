package kg.attractor.java.handler;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {
    private List<Book> books = new ArrayList<>();

    public BooksDataModel() {
        books.add(new Book(1, "Java: The Complete Reference", "Herbert Schildt", "images/coding-book.png", "AVAILABLE"));
        books.add(new Book(2, "First Code", "Robert Martin", "images/coding-book.png", "AVAILABLE"));
        books.add(new Book(3, "Effective Java", "Joshua Bloch", "images/coding-book.png", "AVAILABLE"));
        books.add(new Book(4, "Head First Java", "Kathy Sierra", "images/coding-book.png", "AVAILABLE"));
        books.add(new Book(5, "Design Patterns", "Erich Gamma", "images/coding-book.png", "AVAILABLE"));
        books.add(new Book(6, "The Pragmatic Programmer", "Andrew Hunt", "images/coding-book.png", "AVAILABLE"));
    }

    public List<Book> getBooks() {
        return books;
    }
}

