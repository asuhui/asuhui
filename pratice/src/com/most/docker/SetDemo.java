package com.most.docker;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet 无序 不重复
 * TreeSet 默认进行排序 不重复
 * */
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("LOL");
        set.add("CS");
        set.add("DNF");

        System.out.println(set);
        System.out.println(set.contains("DNF"));
        set.remove("CS");
        System.out.println(set);
        System.out.println(set.size());
    }
}
