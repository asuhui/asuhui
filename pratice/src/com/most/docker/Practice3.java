package com.most.docker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        int[] li = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

        for (int i : li) {
            if (i >= 66) {
                if (!map.containsKey("k1")) {
                    map.put("k1", new ArrayList<Integer>());
                }
                map.get("k1").add(i);
            } else {
                if (!map.containsKey("k2")) {
                    map.put("k2", new ArrayList<Integer>());
                }
                map.get("k2").add(i);
            }
        }
        System.out.println(map);
    }
}
