package UIs.Cli;

import Enums.Pages;
import Factories.PageFactory;
import Stores.StoreAdapter;
import UIs.UI;

import java.util.Scanner;

public class Cli implements UI {

    private final StoreAdapter store;

    public Cli(StoreAdapter store) {
        this.store = store;
    }

    @Override
    public void show() {
        System.out.println("\t\t\t\t---------- Welcome to LibMS ----------");

        while (true) {
            String pageResponse = PageFactory.Create(Pages.Home).show();

            switch (pageResponse) {
                case "1": // Manage Books

                    break;

                case "2": // Manage Users

                    break;

                case "3": // Lend a book

                    break;

                case "4": // Return a book

                    break;

                case "q":
                case "Q":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Error response. Retry...");
            }
        }
    }
}
