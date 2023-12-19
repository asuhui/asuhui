package com.collection.cn;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    @Test
    public void f01() {
        List list = new LinkedList();
        list.add("12");
        list.add("45");
        list.add(12);
        System.out.println(list.size());
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f02() {
        List list = new LinkedList<String>();
        list.add("1234");
        list.add("4566");
        list.add(1);
        list.remove(0);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
