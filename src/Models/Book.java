package Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private Member borrower;
    private Date borrowedDate;

    public Book(String name, String author, String isbn, Member borrower, Date borrowedDate) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.borrower = borrower;
        this.borrowedDate = borrowedDate;
    }

    public String getIsbn() {
        return isbn;
    }

    /**
     * Returns the string representation of a book object
     *
     * @return String in form of ISBN | Name | Author | Borrower_Name | Borrowed_Date
     * if the book hasn't borrowed, returns "-" in the place of both Borrower_Name and Borrowed_Date
     */
    public String toString() {

        String borrowerName;
        String borrowedDateStr;

        if (borrowedDate == null) borrowedDateStr = "-";
        else borrowedDateStr = new SimpleDateFormat("dd-MM-YYY").format(borrowedDate);

        if(borrower == null)
            borrowerName = "-";
        else
            borrowerName = borrower.getName();


        return String.format("%s\t|\t%s\t|\t%s\t|\t%s", isbn, name, borrowerName, borrowedDateStr);
    }
}
