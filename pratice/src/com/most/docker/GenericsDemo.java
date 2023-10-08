package com.most.docker;

import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");

        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("sha", "sxz");
        map.put("zhu", "zxt");

        String ss = map.get("sha");
        System.out.println(ss);
    }
}
