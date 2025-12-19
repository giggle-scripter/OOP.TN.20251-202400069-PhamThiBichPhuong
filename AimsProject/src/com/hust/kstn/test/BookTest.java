package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor janeAusten = new BookAuthor(
            "Jane Austen", 
            1775, 
            "An English novelist known for her romantic fiction set among the landed gentry."
        );
        List<BookAuthor> austenAuthorList = new ArrayList<>();
        austenAuthorList.add(janeAusten);
        Book prideAndPrejudice = new Book(
            "Pride and Prejudice", 
            "Classic Romance", 
            12.99, 
            122000, 
            austenAuthorList
        );

        System.out.println("===== Jane Austen's Book =====");
        System.out.println(prideAndPrejudice);
        System.out.println("\n"); 
        BookAuthor author1 = new BookAuthor("J.K. Rowling", 1965, "British author, best known for the Harry Potter series");
        BookAuthor author2 = new BookAuthor("George R.R. Martin", 1948, "American novelist and short-story writer in the fantasy, horror, and science fiction genres");
        List<BookAuthor> authorsList = new ArrayList<>();
        authorsList.add(author1);
        authorsList.add(author2);
        Book book1 = new Book(
            "Harry Potter and the Philosopher's Stone", 
            "Fantasy", 
            25.50, 
            76944, 
            authorsList
        );
        System.out.println("===== Book Information Test =====");
        System.out.println(book1);
    }
}