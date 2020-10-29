package com.ljnpng.generics;

/**
 * <p>堆栈类FILO</p>
 * <br>
 * top是一个末端哨兵 来判断堆栈何时为空
 * 内部类可以访问外部类的类型参数
 *
 * @param <T>
 */
public class LinkedStack<T> {
    private Node top = new Node();

    private class Node {
        T item;
        Node next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            stack.push(s);
        }
        String s;
        while ((s = stack.pop()) != null) {
            System.out.println(s);
        }
    }
}
