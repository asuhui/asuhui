package cn.fii.demo.test;

import cn.fii.demo.entity.Animal;
import cn.fii.demo.entity.Dog;
import cn.fii.demo.entity.Master;
import cn.fii.demo.entity.Penguin;

public class DogTest {
    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog("sallen", 90, 0, "Q");
        Penguin penguin = new Penguin("hello", 20, 1, "P");
        Penguin penguin1 = new Penguin("hello", 20, 1, "P");
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
//        dog.print();
//        penguin.print();
        master.feed(dog);
        master.feed(penguin);

        Animal a1 = master.adopt("1");
        a1.print();
        Animal a2 = master.adopt("2");
        a2.print();
        System.out.println("##########");
        master.playing(dog);
        dog.print();
        master.playing(penguin);
        penguin.print();
    }
}
