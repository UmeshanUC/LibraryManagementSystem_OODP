package UIs.Cli;

import Enums.Pages;
import Factories.PageFactory;
import Stores.StoreAdapter;
import UIs.PageBase;

public class HomePage extends PageBase {
    public HomePage(StoreAdapter store) {
        super(store);
    }

    @Override
    public char execute() {
        System.out.println("Press the number keys to proceed");
        System.out.print("\t");
        System.out.println("[1] Manage Members");
        System.out.print("\t");
        System.out.println("[2] Manage Books");
        System.out.print("\t");
        System.out.println("[3] Lend a book");
        System.out.print("\t");
        System.out.println("[4] Return a book");
        System.out.print("\n");
        System.out.print("\t");
        System.out.println("[q] Exit");

        System.out.print("Enter: ");
        char res = getUserActionInput();
        char pageRes = 0;
        switch (res) {
            case '1' -> // Manage Members
            {
                pageRes = PageFactory.Create(Pages.MemberManage, dataStore).show();
            }

            case '2' -> // Manage Books
            {
                pageRes = PageFactory.Create(Pages.BookManage, dataStore).show();
            }

            case '3' -> // Lend a book
            {
                pageRes = PageFactory.Create(Pages.LendBook, dataStore).show();
            }
            case '4' -> // Return a book
            {
                pageRes = PageFactory.Create(Pages.ReturnBook, dataStore).show();
            }

            case 'q', 'Q' -> {
                System.exit(0);
            }
        }
        if (pageRes == 'b') rerenderOnBackNavigation();
        return res;
    }
}
