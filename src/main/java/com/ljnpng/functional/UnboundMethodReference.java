package com.ljnpng.functional;
class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transForm(X x);
}

/**
 * 未绑定的方法引用，接口方法的第一个参数可以当作是x的引用
 */
public class UnboundMethodReference {
    public static void main(String[] args) {
//        MakeString m = X::f;
        TransformX t = X::f;
        X x = new X();
        System.out.println(x.f());
        System.out.println(t.transForm(x));
    }
}
