package org.example;

public class Tuple<T, K> {
    private T item1;
    private K item2;

    private Tuple(T item1, K item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() { return item1; }

    public K getItem2() { return item2; }

    public void setItem1(T item1) { this.item1 = item1; }

    public void setItem2(K item2) { this.item2 = item2; }

    public static Tuple of(Object item1, Object item2) {
        return new Tuple(item1, item2);
    }

    public static Tuple of(Object item) {
        return new Tuple(item, null);
    }

    public static Tuple of() {
        return new Tuple(null, null);
    }
}