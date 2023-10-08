package com.most.docker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("123");
        list.add("456");
        list.add("789");

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s);
        }
    }
}
