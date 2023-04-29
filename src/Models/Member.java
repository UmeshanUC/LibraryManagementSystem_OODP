package Models;

import java.text.SimpleDateFormat;
import java.util.List;

public class Member {
    public Member(int id, String name, List<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }

    private final String name;
    private int id;
    private final List<Book> borrowedBooks;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {

        return String.format("\t%s\t|\t%s\t", id, name);
    }
}
