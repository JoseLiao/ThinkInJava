package com.ljnpng.polymorphic;

public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }

    private static class StaticSuper {

        public static String staticGet() {
            return "Base staticGet()";
        }

        public String dynamicGet() {
            return "Base dynamicGet()";
        }
    }

    private static class StaticSub extends StaticSuper {

        public static String staticGet() {
            return "Derived staticGet()";
        }

        @Override
        public String dynamicGet() {
            return "Derived dynamicGet()";
        }
    }
}
