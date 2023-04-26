package Builders;

import Models.Book;
import Models.Member;

import java.util.List;

/**
 * Provides methods to build a Member object following builder pattern
 */
public class MemberBuilder {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public MemberBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public MemberBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MemberBuilder setBooks(List<Book> books) {
        this.borrowedBooks = books;
        return this;
    }

    public Member GetMember(){
        return new Member(id, name, borrowedBooks);
    }
}
