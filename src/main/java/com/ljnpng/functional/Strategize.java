package com.ljnpng.functional;

interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}


public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        this.msg = msg;
        strategy = new Soft();
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    public static void main(String[] args) {
        Strategy[] strategies = {new Strategy() {
            @Override
            public String approach(String msg) {
                return msg.toUpperCase() + "!";
            }
        },
                msg -> msg.substring(0, 5), //这个相当于实现一个Strategy msg是approach的入参， 后面是方法体
                Unrelated::twice //相当于再内部类方法approach直接调用twice方法
        };

        Strategize s = new Strategize("hello");
        s.communicate();
        for (Strategy strategy : strategies) {
            s.changeStrategy(strategy);
            s.communicate();
        }

    }

}
