package Models;

import java.util.List;

public class Member {
    public Member(int id, String name, List<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }

    private String name;
    private int id;
    private List<Book> borrowedBooks;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
