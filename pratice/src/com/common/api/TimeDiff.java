package com.common.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDiff {
    public static void main(String[] args) throws ParseException {
        String s1 = "2019-11-12 12:00:00";
        String s2 = "2019-11-12 14:20:00";

        //格式化时间的工具
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //把字符串转化成时间
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);

        //转化成long类型的时间
        long l1 = d1.getTime();
        long l2 = d2.getTime();

        long diff = Math.abs(l2 - l1);

        //秒级别的时间差
        long diffSec = diff / 1000;

        //分钟级别时间差
        long diffMin = diffSec / 60;

        //显示成xxx小时xxx分钟
        long diffHourDisplay = diffMin / 60;
        long diffMinDisplay = diffMin % 60;

        System.out.println("您一共玩了" + diffHourDisplay + "小时" + diffMinDisplay + "分钟");
    }
}
