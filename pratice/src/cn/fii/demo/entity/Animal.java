package cn.fii.demo.entity;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int health;
    private int love;

    public Animal() {
    }

    public Animal(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
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
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return health == animal.health &&
                love == animal.love &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, love);
    }

    public void print() {
        System.out.println("I am an animal");
        System.out.print("name:" + this.name + " " + "health:" + this.health + " " + "love:" + this.love + " ");
    }

    public abstract void ab();

    public abstract void eat();
}
