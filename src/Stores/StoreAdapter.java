package Stores;

import Exceptions.StoreException;
import Models.Library;

public interface StoreAdapter{
    <T> void store(T item) throws StoreException;
    <T> void remove(T item) throws StoreException;
    Library getStore();

}
