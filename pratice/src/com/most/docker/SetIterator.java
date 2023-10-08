package com.most.docker;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("123");
        set.add("456");
        set.add("789");

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s);
        }
    }
}
