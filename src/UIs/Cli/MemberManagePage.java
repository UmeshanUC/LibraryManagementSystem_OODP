package UIs.Cli;

import Enums.Pages;
import Factories.PageFactory;
import Stores.StoreAdapter;
import UIs.PageBase;

public class MemberManagePage extends PageBase {
    public MemberManagePage(StoreAdapter store) {
        super(store);
    }

    @Override
    public char execute() {
        System.out.println("Press the number keys to proceed");
        System.out.print("\t");
        System.out.println("[1] Add a Member");
        System.out.print("\t");
        System.out.println("[2] Remove a Member");
        System.out.print("\t");
        System.out.println("[3] Show all Members");
        System.out.print("\t");
        System.out.println("[b] Back");
        System.out.print("\n");
        System.out.print("\t");
        System.out.println("[q] Exit");

        System.out.print("Enter: ");
        char res = getUserActionInput();


        char pageRes = 0;
        switch (res) {
            case '1' -> {   // Add a Member
                pageRes = PageFactory.Create(Pages.AddMember, dataStore).show();

            }
            case '2' -> {   // Remove a Member
                pageRes = PageFactory.Create(Pages.RemoveMember, dataStore).show();
            }
            case '3' -> {   // Remove a Member
                pageRes = PageFactory.Create(Pages.ShowMembers, dataStore).show();
            }
            case 'b' -> {   // Back
                pageRes = 'b';
            }
            case 'q', 'Q' -> {  // Exit
                exitApp(0);
            }
        }
        if (pageRes == 'b') rerenderOnBackNavigation();
        return 0;
    }
}
