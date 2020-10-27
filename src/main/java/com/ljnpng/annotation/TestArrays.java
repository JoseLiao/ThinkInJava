package com.ljnpng.annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname TestArrays
 * @Description TODO
 * @Author liaojp
 * @Date 2020/10/27 10:00
 */
public class TestArrays {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            iterator.remove();
        }

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
