package UIs.Cli;

import Models.Book;
import Models.Member;
import Stores.StoreAdapter;
import UIs.PageBase;

public class LendBookPage extends PageBase {

    public LendBookPage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Enter details");

        String bookIsbn = getUserStringInput("\tISBN of Book: ");
        String memberId = getUserStringInput("\tId of borrowing member: ");

        try {
            Book book = dataStore.getStore().getBook(bookIsbn);
            Member borrowingMember = dataStore.getStore().getMember(Integer.parseInt(memberId));
            book.setBorrower(borrowingMember);

            alert("Updated !");
        } catch (NumberFormatException intParseEx) {
            alert("Number format error occurred in updating ! ");
        } catch (Exception ex) {
            alert("Unexpected error occurred in saving !");
        }
        getUserStringInput("Press any key to continue");

        return 'b';
    }
}
