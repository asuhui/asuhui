package com.common.api;

/*
 * 基本数据类型包装类(都在java.lang包下)
 * byte->Byte 1 byte
 * short->Short 2 byte
 * int->Integer 4 byte
 * long->Long 8 byte
 * float->Float 4 byte
 * double->Double 8 byte
 * char->Character 2 byte
 * boolean->Boolean 1 byte
 * */
public class BasicClassPackage {
    public static void main(String[] args) {
        int i = new Integer(10);// 创建包装类的对象
        Integer ii = 10; // 自动打包
        System.out.println(i + 10); //在使用上， int 和Integer 其实没区别
        System.out.println(ii + 10);

        int j = ii; // 自动解包
        System.out.println(j + 100);
        String a = "1";
        String b = "1";
        System.out.println(a + b);

        int c = Integer.parseInt(a); // 字符串转化成int唯一的方案
        int d = Integer.parseInt(b); // 字符串转化成int唯一的方案
        System.out.println(c + d);

        String e = "1.25";
        double f = Double.parseDouble(e);
        System.out.println(f);

        long l = Long.parseLong("12323131313133");
        System.out.println(l);

        String str = "abed";
        char cc = str.charAt(1);
        System.out.println(cc);
    }
}
