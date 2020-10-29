package com.ljnpng.generics;

class Automobile{}

class Phone extends Automobile{}

public class Holder1 {
    private Automobile automobile;

    public Holder1(Automobile automobile) {
        this.automobile = automobile;
    }

    public Automobile getAutomobile() {
        return automobile;
    }
}
