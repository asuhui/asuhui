package com.most.docker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(322);
        list.add(789);

        Integer min = Collections.min(list);
        System.out.println(min);
        Integer max = Collections.max(list);
        System.out.println(max);
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
