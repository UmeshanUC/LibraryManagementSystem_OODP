
package UIs.Cli;

import Models.Book;
import Stores.StoreAdapter;
import UIs.PageBase;

import java.util.List;

public class ShowOverdueBooksPage extends PageBase {
    public ShowOverdueBooksPage(StoreAdapter dataStore) {
        super(dataStore);
    }

    @Override
    protected char execute() {
        List<Book> books = dataStore.getStore().getOverdueBooks();
        int bookCount = books.size();

        System.out.println(bookCount + " overdue books were found");
        if (bookCount > 0) {
            for (int i = 0; i < books.size(); i++) {
                System.out.printf("\t%s. %s%n", i + 1, books.toArray()[i].toString());
            }
        }

        pause();
        return 'b';
    }
}
