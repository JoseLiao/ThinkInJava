package com.ljnpng.generics;

import com.ljnpng.generics.coffee.Coffee;
import com.ljnpng.generics.coffee.CoffeeGenerator;
import com.ljnpng.generics.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> fill = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : fill) {
            System.out.println(coffee);
        }

        Collection<Integer> fill1 = fill(new ArrayList<>(), new Fibonacci(), 4);
        for (Integer integer : fill1) {
            System.out.print(integer + " ");

        }
    }
}
