package com.ljnpng.generics;

public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CountedObject{" +
                "id=" + id +
                '}';
    }
}
