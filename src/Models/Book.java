package Models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private Member borrower;
    private Date borrowedDate;
    private final int LENDING_DURATION_DAYS = 30; // No of days allowed to return a book after lending it


    public Book(String name, String author, String isbn, Member borrower, Date borrowedDate) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.borrower = borrower;
        this.borrowedDate = borrowedDate;
    }

    public boolean isAvailable(){
        return (borrower == null);
    }

    public boolean isOverdue(){
        // If the book hasn't been borrowed yet
        if(borrower== null) return false;

        return (new Date().compareTo(borrowedDate) > LENDING_DURATION_DAYS);
    }

    /**
     * Update the book as a borrowed book by adding borrower and borrowed date
     * @param member borrowed member of the book
     */
    public void setBorrower(Member member){
        borrower = member;
        borrowedDate = new Date();
    }

    public void setReturned(){
        borrower = null;
        borrowedDate = null;
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
