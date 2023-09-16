package cn.cusip.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //java.util.InputMismatchException
        //java.lang.NullPointerException
        //1.finally代码块不执行的唯一条件：java虚拟机退出
        try {
            System.out.println(args[0]);
            System.out.print("please enter a number:");
            int num = scanner.nextInt();
            System.out.println(num);
            System.exit(0);//Terminates the currently running Java Virtual Machine 结束当前java虚拟机 不执行 finally
        } catch (InputMismatchException exception) {
            System.out.println("enter uncorrected");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("progress ending");
    }
}
