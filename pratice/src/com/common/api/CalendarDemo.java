package com.common.api;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - 130); //计算时间

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);// 月份从0开始
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        System.out.println(calendar.getTime());//拿到的是Date对象
        Date d = new Date();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(d);
        System.out.println(calendar1);
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH) + 1);
        System.out.println(calendar1.get(Calendar.DATE));
    }
}
