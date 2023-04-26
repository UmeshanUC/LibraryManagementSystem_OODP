package UIs.Cli;

import Enums.Pages;
import Factories.PageFactory;
import Stores.StoreAdapter;
import UIs.UI;

public class Cli implements UI {

    private final StoreAdapter store;

    public Cli(StoreAdapter store) {
        this.store = store;
    }

    @Override
    public void show() {
        System.out.println("\n\n\t\t\t\t---------- Welcome to LibMS ----------\n\n");

            char pageRes = PageFactory.Create(Pages.Home, store).show();
    }
}
