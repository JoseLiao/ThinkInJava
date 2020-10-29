package com.ljnpng.generics;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        h3.setA(new Phone());
        assert h3.getA() != null;
    }

}
