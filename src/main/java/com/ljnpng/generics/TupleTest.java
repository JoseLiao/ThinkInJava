package com.ljnpng.generics;

import com.ljnpng.generics.util.FiveTuple;
import com.ljnpng.generics.util.FourTuple;
import com.ljnpng.generics.util.ThreeTuple;
import com.ljnpng.generics.util.TwoTuple;

import java.net.Inet4Address;

class Amphibian{}
class Vehicle{}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("String", 1);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "Strin", 2);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "s", 4);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> i() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "s", 1, 4.3d);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> f = f();
        System.out.println(f.first);
        System.out.println(f);
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
    }

}
