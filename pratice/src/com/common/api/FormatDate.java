package com.common.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormatDate {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String s = sdf.format(d);//时间转化成字符串
        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个时间（yyyy-MM-dd HH:mm:ss）:");
        String ss = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(ss);//字符串转换成时间
        System.out.println(date);
    }
}
