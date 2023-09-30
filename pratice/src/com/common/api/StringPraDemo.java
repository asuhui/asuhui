package com.common.api;

public class StringPraDemo {
    public static void main(String[] args) {
        String[] ss = {"小明_数学_12_语文_22_英语_33", "小王_数学_44_语文_55_英语_66", "小红_数学_77_语文_88_英语_99"};
        for (int i = 0; i < ss.length; i++) {
            String[] str1 = ss[i].split("_");
            String shuxue = str1[2];
            String yuwen = str1[4];
            String yinyu = str1[6];
            double avg = (Integer.parseInt(shuxue) + Integer.parseInt(yuwen) + Integer.parseInt(yinyu)) / 3.0;
            System.out.println(str1[0] + " " + avg);
        }
    }
}
