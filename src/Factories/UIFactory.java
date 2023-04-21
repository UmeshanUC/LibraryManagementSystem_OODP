package Factories;

import Stores.StoreAdapter;
import UIs.Cli;
import UIs.Gui;
import UIs.UI;

import java.util.Arrays;
import java.util.Locale;

public class UIFactory {
    public static UI create(StoreAdapter store, String[] args){
        if(Arrays.stream(args).anyMatch(a->a.toLowerCase(Locale.ROOT).equals("-gui"))){
            return new Gui(store);
        }else {
            return new Cli(store);
        }
    }
}
