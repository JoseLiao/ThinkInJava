package com.ljnpng.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> list = new RandomList<>();
        for (String s : "The quick brown fox jumped over the lazy brown dog".split(" ")) {
            list.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(list.select() + " ");
        }

        RandomList<Integer> lst = new RandomList<>();
        for (Integer integer : Arrays.asList(1, 2, 3, 4, 5, 6, 7)) {
            lst.add(integer);
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(lst.select() + " ");
        }
    }
}
