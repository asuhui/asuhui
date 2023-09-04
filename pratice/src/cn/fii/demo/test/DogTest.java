package cn.fii.demo.test;

import cn.fii.demo.entity.Dog;
import cn.fii.demo.entity.Penguin;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("sallen", 100, 0, "Q");
        dog.setHealth(-100);
        Penguin penguin = new Penguin("hello", 20, 2, "P");
        penguin.setSex(Penguin.SEX_MALE);
//        dog.name = "sallen";
//        dog.health = 100;
//        dog.love = 0;
//        dog.strain = "Q";
//        penguin.name = "hello";
//        penguin.health =20;
//        penguin.love=2;
//        penguin.sex ="P";
        dog.print();
        penguin.print();
    }
}
