package Stores;

public interface StoreAdapter {
    <T> void store(T item);
    <T> void remove(T item);

}
