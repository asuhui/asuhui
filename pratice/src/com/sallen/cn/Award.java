package com.sallen.cn;

import java.util.Scanner;

public class Award {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        switch (st) {
            case 1:
                System.out.println("夏令营");
                break;
            case 2:
                System.out.println("笔记本一台");
                break;
            case 3:
                System.out.println("移动硬盘");
                break;
            default:
                System.out.println("无");
                break;
        }
    }
}
