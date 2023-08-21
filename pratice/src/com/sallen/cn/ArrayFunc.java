package com.sallen.cn;

import java.util.Arrays;

public class ArrayFunc {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 100, 60};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
