package UIs.Cli;

import Builders.BookBuilder;
import Exceptions.StoreException;
import Models.Book;
import Stores.StoreAdapter;
import UIs.PageBase;

public class RemoveBookPage extends PageBase {

    public RemoveBookPage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Enter the ISBN of the book to be removed");

        Book removingBook = new BookBuilder()
                .setIsbn(getUserStringInput("\tISBN: "))
                .getBook();

        try {
            dataStore.remove(removingBook);
        } catch (StoreException ex) {
            alert("Error occurred in removing book");
        }
        return 'b';
    }
}
