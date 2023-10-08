package com.most.docker;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
        String str = "k:1,k1:2,k2:3,k3:4";

        String[] strs = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strs) {
            String[] ss = s.split(":");
            map.put(ss[0], Integer.parseInt(ss[1]));
        }
        System.out.println(map);
    }
}
