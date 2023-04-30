package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Library - Denotes the library
 *
 * @author Umeshan
 */
public class Library {

    //// Lazy Singleton implementation
    private static Library libraryInstance;
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();
    ////

    private Library() {
    }

    /**
     * Implements singleton pattern on Library
     *
     * @return Singleton Library object
     */
    public static Library getInstance() {
        if (libraryInstance == null) {
            libraryInstance = new Library();
        }
        return libraryInstance;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book getBook(String isbn) {
        Book book = null;
        for (Book currentBook : this.books) {
            if (currentBook.getIsbn().equals(isbn)) {
                book = currentBook;
            }
        }
        return book;
    }

    public Member getMember(int id) {
        Member member = null;
        for (Member currentMember : this.members) {
            if (currentMember.getId() == id) {
                member = currentMember;
            }
        }
        return member;
    }

    private int generateNewMemberId() {
        int maxMemberId = 0;
        for (Member member : members) {
            if (maxMemberId < member.getId()) maxMemberId = member.getId();
        }
        return ++maxMemberId;
    }

    public void addMember(Member member) {
        member.setId(generateNewMemberId());
        this.members.add(member);
    }

    public void removeMember(int id) {
        this.members.removeIf(member -> member.getId() == id);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();

        this.books.forEach(book -> {
            if (book.isAvailable()) availableBooks.add(book);
        });

        return availableBooks;
    }

    public List<Book> getBorrowedBooks() {
        List<Book> borrowedBooks = new ArrayList<>();

        this.books.forEach(book -> {
            if (!book.isAvailable()) borrowedBooks.add(book);
        });

        return borrowedBooks;
    }

    public List<Book> getOverdueBooks() {
        List<Book> overdueBooks = new ArrayList<>();

        this.books.forEach(book -> {
            if (book.isOverdue()) overdueBooks.add(book);
        });

        return overdueBooks;
    }

    public List<Member> getAllMembers() {
        return members;
    }

}
