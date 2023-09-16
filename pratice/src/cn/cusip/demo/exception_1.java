package cn.cusip.demo;

import java.util.Scanner;

public class exception_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a number:");
        //java.util.InputMismatchException
        //java.lang.NullPointerException
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
        } else {
            System.out.println("please enter a number:");
        }
    }
}
