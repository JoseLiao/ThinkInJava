package com.ljnpng.generics;

public class Holder2 {
    private Object object;

    public Holder2(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        assert holder2.getObject() instanceof Automobile;
        holder2.setObject("this is a String");
        assert holder2.getObject() instanceof String;
    }
}
