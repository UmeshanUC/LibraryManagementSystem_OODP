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
    private Library(){}

    /**
     * Implements singleton pattern on Library
     * @return Singleton Library object
     */
    public static Library getInstance(){
        if(libraryInstance == null){
            libraryInstance = new Library();
        }
        return libraryInstance;
    }
    ////

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book getBook(String isbn){
        Book book = null;
        for (Book currentBook : this.books) {
            if (currentBook.getIsbn().equals(isbn)) {
                book = currentBook;
            }
        }
        return book;
    }

    public Member getMember(int id){
        Member member = null;
        for (Member currentMember : this.members) {
            if (currentMember.getId() == id) {
                member = currentMember;
            }
        }
        return member;
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMember(Member member) {
        this.members.remove(member);
    }

    public Book[] getAvailableBooks() {
        return books.toArray(new Book[0]);
    }

    public Member[] getAvailableMembers() {
        return members.toArray(new Member[0]);
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public List<Member> getAllMembers(){
        return members;
    }

}
