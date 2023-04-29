package UIs.Cli;

import Models.Book;
import Models.Member;
import Stores.StoreAdapter;
import UIs.PageBase;

public class ReturnBookPage extends PageBase {

    public ReturnBookPage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Enter details");

        String bookIsbn = getUserStringInput("\tISBN of Book: ");

        try {
            Book book = dataStore.getStore().getBook(bookIsbn);
            book.setReturned();

            alert("Updated !");
        } catch (NumberFormatException intParseEx) {
            alert("Number format error occurred in updating ! ");
        } catch (Exception ex) {
            alert("Unexpected error occurred in saving !");
        }
        // Wait for user interaction
        getUserActionInput();

        return 'b';

    }
}
