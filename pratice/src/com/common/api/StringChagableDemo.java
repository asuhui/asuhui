package com.common.api;

public class StringChagableDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //这个相当于创建了一个“” StringBuffer
        StringBuilder sb1 = new StringBuilder("hello world!");
        sb1.append(" my world!");
        System.out.println(sb1);
        sb1.insert(1, "yui");
        System.out.println(sb1);
    }
}
