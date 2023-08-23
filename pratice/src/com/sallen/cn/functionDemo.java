package com.sallen.cn;

import java.util.Arrays;

public class functionDemo {
    public static void main(String[] args) {
        fun1(1);
        fun1(2, 3);
        fun3();
        fun3(1, 2, 3);
        fun3(new int[]{3, 4, 5});
        fun4(1, 2, 3);
    }

    //方法的重载只有参数有关不与返回值有关
    public static void fun1(int a) {
        System.out.println(a);
    }

    public static void fun1(int a, int b) {
        System.out.println(a + b);
    }

    public static void fun3(int... a) {//不得长参数
        System.out.println(Arrays.toString(a));
    }

    public static void fun4(int... arr) {//不得长参数
        for (int i : arr) {//foreach iter
            System.out.println(i);
        }
    }

}
