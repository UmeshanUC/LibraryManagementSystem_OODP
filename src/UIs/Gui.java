package UIs;

import Stores.StoreAdapter;

public class Gui implements UI {
    private StoreAdapter store;

    public Gui(StoreAdapter store) {

        this.store = store;
    }

    @Override
    public void show() {

    }
}
