package com.ljnpng.generics.util;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E five;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.five = e;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "five=" + five +
                ", four=" + four +
                ", three=" + three +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
