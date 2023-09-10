package cn.fii.demo.entity;

import java.util.Objects;

public class Penguin extends Animal {
    //常量定义
    public static final String SEX_MALE = "M";
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("sex:" + this.sex + " ");
    }

    @Override
    public void ab() {

    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                "} " + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Penguin penguin = (Penguin) o;
        return Objects.equals(sex, penguin.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex);
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
        this.setHealth(this.getHealth() + 5);
        this.print();
    }

    public void swimming() {
        this.setHealth(this.getHealth() - 3);
        this.setLove(this.getLove() + 3);
    }
}

