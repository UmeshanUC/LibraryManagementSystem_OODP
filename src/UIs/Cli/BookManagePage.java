package UIs.Cli;

import Enums.Pages;
import Factories.PageFactory;
import Stores.StoreAdapter;
import UIs.PageBase;

public class BookManagePage extends PageBase {

    public BookManagePage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Press the number keys to proceed");
        System.out.print("\t");
        System.out.println("[1] Add a Book");
        System.out.print("\t");
        System.out.println("[2] Remove a Book");
        System.out.print("\t");
        System.out.println("[3] Show all Books");
        System.out.print("\t");
        System.out.println("[b] Back");
        System.out.print("\n");
        System.out.print("\t");
        System.out.println("[q] Exit");

        System.out.print("Enter: ");
        char res = getUserActionInput();

        char pageRes = 0;
        switch (res) {
            case '1' -> {   // Add a Book
                pageRes = PageFactory.Create(Pages.AddBook, dataStore).show();

            }
            case '2' -> {   // Remove a Book
                pageRes = PageFactory.Create(Pages.RemoveBook, dataStore).show();
            }
            case '3' -> {   // Show all Books
                pageRes = PageFactory.Create(Pages.ShowBooks, dataStore).show();
            }
            case 'b' -> {   // Back
                // captures 'back' only from this page user input
                return 'b';
            }
            case 'q', 'Q' -> {  // Exit
                exitApp(0);
            }
        }
        return 0;
    }
}
