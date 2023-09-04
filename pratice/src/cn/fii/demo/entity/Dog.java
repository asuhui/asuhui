package cn.fii.demo.entity;

public class Dog {
    public String name;
    public int health;
    public int love;
    public String strain;

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain = strain;
    }

    public void print() {
        System.out.println("I am a dog");
        System.out.println("name:" + name + " " + "health:" + health + " " + "love:" + love + " " + "strain:" + strain + " ");
    }
}

