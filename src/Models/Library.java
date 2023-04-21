package Models;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * Library - Denotes the library
 *
 * @author Umeshan
 */
public class Library {
    private List<Book> books;
    private List<Member> members;
    private int lendingDurationInDays = 30; // No of days allowed to return a book after lending it


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
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


}
