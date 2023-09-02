package com.sallen.cn;

public class School {
    int age;
    int scNo;
    private String name;

    public School(String name) {
        this.name = name;
    }

    public School(int age, int scNo) {
        this.age = age;
        this.scNo = scNo;
    }

    public void showInfo() {
        System.out.println(this.age);
        System.out.println(this.scNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

