package cn.fii.demo.entity;

public class Penguin {
    //常量定义
    public static final String SEX_MALE = "Q";
    private String name;
    private int health;
    private int love;
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) health = 0;
        else if (health > 100) health = 100;
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void print() {
        System.out.println("I am a penguin");
        System.out.println("name:" + name + " " + "health:" + health + " " + "love:" + love + " " + "sex:" + sex + " ");
    }
}

