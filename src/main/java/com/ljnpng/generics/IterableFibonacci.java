package com.ljnpng.generics;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci integers = new IterableFibonacci(10);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
