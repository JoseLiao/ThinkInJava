package com.ljnpng.annotation;

/**
 * @Classname Parents
 * @Description TODO
 * @Author liaojp
 * @Date 2020/10/27 10:14
 */
public class Parents {
    public void showName() {
        System.out.println("parent");
    }

    class Child {
        public void showName() {
            System.out.println("child");
            Parents.this.showName();
        }
    }

    public void doSomethingWithChild() {
        new Child().showName();
    }

    public static void main(String[] args) {
        new Parents().doSomethingWithChild();
    }
}
