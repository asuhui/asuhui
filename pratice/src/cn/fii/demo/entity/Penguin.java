package cn.fii.demo.entity;

public class Penguin extends Animal {
    //常量定义
    public static final String SEX_MALE = "Q";
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
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                "} " + super.toString();
    }
}

