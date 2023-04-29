package UIs.Cli;

import Builders.BookBuilder;
import Exceptions.StoreException;
import Models.Book;
import Stores.StoreAdapter;
import UIs.PageBase;

public class AddBookPage extends PageBase {

    public AddBookPage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Enter book details");
        Book book = new BookBuilder()
                .setName(getUserStringInput("\tName: "))
                .setIsbn(getUserStringInput("\tISBN: "))
                .setAuthor(getUserStringInput("\tAuthor: "))
                .getBook();

        try {
            dataStore.store(book);
            alert("Saved successfully !");
        } catch (StoreException ex) {
            alert("Error occurred in adding book");
        }

        return 'b';
    }
}
