package com.sallen.cn;

import java.util.Arrays;

public class ArrayAntherFunc {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 5, 4, 100, 60};
        int[] arr2 = {3, 1, 5, 4, 100, 60};
        Boolean bl = Arrays.equals(arr1, arr2);//比较2个数组是否相等
        System.out.println(bl);
        Arrays.fill(arr1, 11);//把数组arr1 都赋值为val
        System.out.println(Arrays.toString(arr1));
        int[] arr3 = Arrays.copyOf(arr2, 7);//把数组复制一个数组为长度为length的新数组
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr2);
        int pos = Arrays.binarySearch(arr2, 4);//查询元素在数组中的下标（要求数组中元素按照升序排序）
        System.out.println(pos);
        char[] ch = {'c', 'h', 'e', 'l'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}
