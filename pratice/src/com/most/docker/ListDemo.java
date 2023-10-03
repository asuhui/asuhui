package com.most.docker;

import java.util.ArrayList;
import java.util.List;

/*
 * Arraylist -> 列表
 * ListedList -> 链表
 * */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("!");
        System.out.println(list);
        System.out.println(list.contains("hello"));
        list.remove("!");
        System.out.println(list);
        String s = (String) list.get(1);
        System.out.println(s);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            String s1 = (String) list.get(i);
            System.out.println(s1);
        }
    }
}
