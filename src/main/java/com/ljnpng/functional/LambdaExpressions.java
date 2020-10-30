package com.ljnpng.functional;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {
    static Body body = head -> head + "No present!";

    static Body body1 = (head) -> head + "More Details";

    static Description description = () -> "short brief";

    static Multi multi = (head, d) -> head + d;

    static Multi multi1 = (head, d) -> {
        System.out.println("产生副作用");
        return head + d + "1";
    };

    public static void main(String[] args) {
        System.out.println(body.detailed("head"));
        System.out.println(body1.detailed("go"));
        System.out.println(description.brief());
        System.out.println(multi.twoArg("h", 3d));
        System.out.println(multi1.twoArg("hhh", 3.8d));
    }
}
