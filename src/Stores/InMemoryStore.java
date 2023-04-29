package Stores;

import Exceptions.StoreException;
import Models.Book;
import Models.Library;
import Models.Member;

public class InMemoryStore implements StoreAdapter {

    protected Library library = Library.getInstance();

    @Override
    public <T> void store(T item) throws StoreException {

        // null check
        if (item == null) throw new StoreException("Null values cannot be passed to store");

        if (item instanceof Book) {
            library.addBook((Book) item);
        } else if (item instanceof Member) {
            library.addMember((Member) item);
        } else {
            throw new StoreException("Data type of the item was invalid.");
        }
    }

    @Override
    public <T> void remove(T item) throws StoreException {
        if (item instanceof Book) {
            Book removingBook = library.getBook(((Book) item).getIsbn());
            library.removeBook((Book) item);
        } else if (item instanceof Member) {
            library.removeMember(((Member) item).getId());
        } else {
            throw new StoreException("Data type of the item was invalid.");
        }
    }

    @Override
    public Library getStore() {
        return library;
    }
}
