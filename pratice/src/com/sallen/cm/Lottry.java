package com.sallen.cm;

import java.util.Scanner;

public class Lottry {
    public static void main(String[] args) {
        System.out.print("是否会员（y/n）:");
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        if (in.toLowerCase().equals("y")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
