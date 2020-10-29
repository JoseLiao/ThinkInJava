package com.ljnpng.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> lst = new ArrayList<>();
        for (T arg : args) {
            lst.add(arg);
        }
        return lst;
    }

    public static void main(String[] args) {
        List<String> sl = makeList("1", "2");
        System.out.println(sl);
    }
}
