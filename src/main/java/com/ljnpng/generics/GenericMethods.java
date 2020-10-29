package com.ljnpng.generics;

public class GenericMethods {
    public <A, B, C> void f(A a, B b, Float c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("",1,1f);
    }
}
