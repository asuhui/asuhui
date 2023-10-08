package com.most.docker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("sha", "sxz");
        map.put("zhu", "zxt");

        //Set set = map.keySet();
        //Iterator iter = set.iterator();
        //while (iter.hasNext()){
        //    String s = (String) iter.next();
        //    System.out.println(s);
        //}

        Set set = map.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
