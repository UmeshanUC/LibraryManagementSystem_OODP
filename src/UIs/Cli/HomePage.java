package UIs.Cli;

import UIs.PageBase;

public class HomePage extends PageBase {
    @Override
    public String show() {
        System.out.println("Press the number keys to proceed");
        System.out.print("\t");
        System.out.println("[1] Manage Books");
        System.out.print("\t");
        System.out.println("[2] Manage Users");
        System.out.print("\t");
        System.out.println("[3] Lend a book");
        System.out.print("\t");
        System.out.println("[4] Return a book");
        System.out.print("\t");
        System.out.println("[q] Exit");

        System.out.print("Enter: ");
        return GetUserInput();
    }
}
