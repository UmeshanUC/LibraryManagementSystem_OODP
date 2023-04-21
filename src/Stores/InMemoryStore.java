package Stores;

import Models.Book;
import Models.Library;
import Models.Member;

public class InMemoryStore implements StoreAdapter {

    Library library = new Library();

    @Override
    public <T> void store(T item) {
        if (item instanceof Book) {
            library.addBook((Book) item);
        } else if (item instanceof Member) {

        }
    }

    @Override
    public <T> void remove(T item) {
        if (item instanceof Book) {
            library.removeBook((Book) item);
        }
    }
}
