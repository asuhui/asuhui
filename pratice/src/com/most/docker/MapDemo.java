package com.most.docker;

import java.util.HashMap;
import java.util.Map;

/* key value
 * HashMap 不排序
 * TreeMap 排序（按照key）
 * 如果出现Key一样的原来的数据会被顶掉
 * */
public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("xiaoming", "89");
        map.put("xiaohong", "99");
        map.put("xiaowang", "76");
        System.out.println(map);
        System.out.println(map.get("xiaoming"));
        System.out.println(map.containsKey("xiaowang"));
        System.out.println(map.size());
        System.out.println(map.remove("xiaoming"));
        System.out.println(map);
        System.out.println(map.keySet());
    }
}
