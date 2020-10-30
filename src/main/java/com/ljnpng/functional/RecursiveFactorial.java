package com.ljnpng.functional;

public class RecursiveFactorial {
    static IntCall intCall;

    public static void main(String[] args) {
        intCall = arg -> arg <= 0 ? 1 : arg * intCall.call(arg - 1);
        for (int i = 0; i < 5; i++) {
            System.out.println(intCall.call(i));
        }
    }
}
