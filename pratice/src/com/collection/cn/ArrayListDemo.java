package com.collection.cn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    @Test
    public void f01() {
        List list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f02() {
        List list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add(1);
        list.remove(0);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
