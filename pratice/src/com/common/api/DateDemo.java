package com.common.api;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        //重点
        System.out.println(d.getTime()); //获取到时间的毫秒表示形式，返回的是long
        System.out.println(d.getYear() + 1900);//从1900年开始计算
        System.out.println(d.getMonth() + 1); //月份从0开始算
        System.out.println(d.getDate());

        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
    }
}
