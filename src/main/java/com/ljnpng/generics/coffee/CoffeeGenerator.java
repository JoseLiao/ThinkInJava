package com.ljnpng.generics.coffee;

import com.ljnpng.generics.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class<?>[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private int size = 0;

    private static Random rand = new Random(47);
    public CoffeeGenerator() {

    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    public static void main(String[] args) {
        CoffeeGenerator coffees = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffees.next());
        }

        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }
}
