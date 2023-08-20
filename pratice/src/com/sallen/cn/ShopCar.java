package com.sallen.cn;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择你要购买的鞋： 1.网球鞋 ");
        System.out.print("2.蓝球鞋 ");
        System.out.println("3.足球鞋");
        String conn = "y";
        while (conn.equals("y")) {
            System.out.print("输入商品编号：");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("网球鞋 100");
                    break;
                case 2:
                    System.out.println("蓝球鞋 200");
                    break;
                case 3:
                    System.out.println("足球鞋 300");
                    break;
            }
            System.out.println("是否继续购买（y/n）");
            conn = sc.next();
        }
        System.out.println("购物结束！");
    }
}
