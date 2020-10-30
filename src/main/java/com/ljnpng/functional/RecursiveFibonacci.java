package com.ljnpng.functional;

public class RecursiveFibonacci {
    IntCall intCall;

    RecursiveFibonacci() {
        intCall = n -> n < 2 ? n : intCall.call(n - 2) + intCall.call(n - 1);
    }

    int fibonacci(int n) {
        return intCall.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(rf.fibonacci(i));
        }
    }
}
