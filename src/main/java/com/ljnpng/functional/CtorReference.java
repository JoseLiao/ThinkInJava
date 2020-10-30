package com.ljnpng.functional;

/**
 * 构造函数的引用
 */
public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs m0 = Dog::new;
        MakeOneArg m1 = Dog::new;
        MakeTwoArgs m2 = Dog::new;

        System.out.println(m0.make());
        System.out.println(m1.make("l"));
        System.out.println(m2.make("haha", 12));
    }
}

class Dog {
    String name;
    int age = -1;

    Dog() {
        name = "maomao";
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

interface MakeNoArgs {
    Dog make();
}

interface MakeOneArg {
    Dog make(String name);
}

interface MakeTwoArgs {
    Dog make(String name, int age);
}
