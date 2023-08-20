package com.sallen.cn;

public class SumNum {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum:" + sum);
        int i1 = 0;
        int sum1 = 0;
        do {
            sum1 += i1;
            i1++;
        } while (i1 <= 100);
        System.out.println("sum:" + sum1);
    }
}
