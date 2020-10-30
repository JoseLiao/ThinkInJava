package com.ljnpng.functional;

class This {
    void two(int i, double d){}
    void three(int i, double d, String s){}
    void four(int i, double d, String s, char c){}
}

interface Args2 {
    void call(This a, int i, double d);
}

interface Args3 {
    void call(This a, int i, double d, String s);
}

interface Args4 {
    void call(This a, int i, double d, String s, char c);
}


public class MultiUnbound {
    public static void main(String[] args) {
        Args2 args2 = This::two;
        Args3 args3 = This::three;
        Args4 args4 = This::four;
        This a = new This();
        args2.call(a, 1, 1.1);
        args3.call(a, 1,1.2, "s");
        args4.call(a, 1,1.2, "s", '1');
    }
}
