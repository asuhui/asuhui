package com.sallen.cn;

public class Iter {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int count) {
        if (count == 1) return 1;
        else return sum(count - 1) + count;
    }
}
