package cn.fii.demo.test;

import cn.fii.demo.entity.Dog;
import cn.fii.demo.entity.Penguin;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("sallen", 100, 0, "Q");
        dog.setHealth(-100);
        Penguin penguin = new Penguin("hello", 20, 2, "P");
        Penguin penguin1 = new Penguin("hello", 20, 2, "P");
        System.out.println(penguin.equals(penguin1));
        penguin.setSex(Penguin.SEX_MALE);
        System.out.println(dog);
        System.out.println(penguin);
        System.out.println(penguin.getClass());
        System.out.println(dog.getClass());
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
