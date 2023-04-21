package Factories;

import Stores.FileStore;
import Stores.InMemoryStore;
import Stores.StoreAdapter;

import java.util.Arrays;
import java.util.Locale;

public class StoreFactory {
    public static StoreAdapter Create(String[] args){
        if(Arrays.stream(args).anyMatch(a->a.toLowerCase(Locale.ROOT).equals("-dryrun"))){
            return new InMemoryStore();
        }else{
            return  new FileStore();
        }
    }
}
