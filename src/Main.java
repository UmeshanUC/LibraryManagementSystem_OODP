import Factories.StoreFactory;
import Factories.UIFactory;
import Stores.StoreAdapter;
import UIs.UI;

public class Main {
    public static void main(String[] args) {
        StoreAdapter store = StoreFactory.Create(args);
        UI ui = UIFactory.create(store, args);
        ui.show();
    }
}