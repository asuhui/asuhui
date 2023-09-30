package com.common.api;

import java.text.DecimalFormat;

public class NumberFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".00");// 00 ##都是表示数字
        double avg = 10 / 3.0;
        System.out.println(df.format(avg));
    }
}
