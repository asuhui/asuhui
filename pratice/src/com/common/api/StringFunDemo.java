package com.common.api;

public class StringFunDemo {
    public static void main(String[] args) {
        String str = "hello world!";
        char str1 = str.charAt(0);
        System.out.println(str1);
        String str2 = str.concat("hmm"); // 字符串不可变
        System.out.println(str2);
        System.out.println(str.contains("hello"));
        System.out.println(str.endsWith("world!"));
        System.out.println(str.startsWith("hello"));
        System.out.println(str.indexOf("ll"));
        System.out.println(str.length());
        String str3 = str.replace("hello", "yes");
        System.out.println(str3);
        String[] str4 = str.split(" ");
        System.out.println(str4[0]);
        System.out.println(str4[1]);
    }
}
