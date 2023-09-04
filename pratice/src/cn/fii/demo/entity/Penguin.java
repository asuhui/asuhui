package cn.fii.demo.entity;

public class Penguin {
    public String name;
    public int health;
    public int love;
    public String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.sex = sex;
    }

    public void print() {
        System.out.println("I am a penguin");
        System.out.println("name:" + name + " " + "health:" + health + " " + "love:" + love + " " + "sex:" + sex + " ");
    }
}

