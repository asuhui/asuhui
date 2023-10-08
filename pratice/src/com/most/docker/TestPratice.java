package com.most.docker;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPratice {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("li");
        li.add("yi");
        li.add("feng");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的评论内容:");
        String content = sc.nextLine();

        for (int i = 0; i < li.size(); i++) {
            String ci = (String) li.get(i);
            if (content.contains(ci)) {
                String s = "";
                for (int j = 0; j < ci.length(); j++) {
                    s += "*";
                }
                content = content.replace(ci, s);
            }
        }
        System.out.println(content);
    }
}
