package zaj4class;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asia on 2017-04-20.
 */
public class Book {


    private String author;
    private int price;
    private static List<Book> allBooks= new ArrayList<>();

    Book(String a, int p) {
        this.author=a;
        this.price=p;
        allBooks.add(this);
    }

    Book(String a) {
        this.author=a;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static List<Book> getAllBooks() {
        return allBooks;
    }

    public static void setAllBooks(List<Book> allBooks) {
        Book.allBooks = allBooks;
    }

}
