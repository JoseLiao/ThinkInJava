package com.ljnpng.generics.util;

/**
 * 二维元组，能够存储两个不同类型的对象。
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "a=" + first +
                ", b=" + second +
                '}';
    }
}
