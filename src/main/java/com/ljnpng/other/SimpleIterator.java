package com.ljnpng.other;

import java.util.*;

public class SimpleIterator {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        lst.forEach(System.out::println);
//        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        Iterator<Integer> it = lst.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.equals(1)) {
                it.remove();
            }
        }
        System.out.println(lst.size());
        Class<? extends Number> a = int.class;
        a = double.class;
        a = float.class;

        Class<? super List> b = Collection.class;

        List<? > list = new ArrayList<HashMap<String, Object>>();
    }
}
