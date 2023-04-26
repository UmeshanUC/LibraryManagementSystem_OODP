package Builders;

import Models.Book;
import Models.Member;

import java.util.Date;

/**
 * Provides methods to build a Book object following builder pattern
 */
public class BookBuilder {
    private String name = null;
    private String author = null;
    private String isbn;
    private Member borrower = null;
    private Date borrowedDate = null;

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder setBorrower(Member member) {
        this.borrower = borrower;
        return this;
    }

    public BookBuilder setBorrowerDate(Date date) {
        this.borrowedDate = date;
        return this;
    }

    public Book getBook() {
        return new Book(name, author, isbn, borrower, borrowedDate);
    }
}
