package com.ljnpng.generics.util;

/**
 * 3维对象
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{

    public final C three;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.three = c;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "three=" + three +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
