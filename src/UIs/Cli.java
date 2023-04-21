package UIs;

import Stores.StoreAdapter;

import java.util.Scanner;

public class Cli implements UI {

    private final Scanner input = new Scanner(System.in);
    private final StoreAdapter store;

    public Cli(StoreAdapter store) {
        this.store = store;
    }

    @Override
    public void show() {
        while (true) {
            System.out.println("\t\t\t\t---------- Welcome to LibMS ----------");
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

            int response = Integer.parseInt(input.nextLine());
        }
    }
}
