package com.ljnpng.generics.util;

/**
 * 4维对象
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 */
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D four;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.four = d;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "four=" + four +
                ", three=" + three +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
