package cn.fii.demo.entity;

import java.util.Objects;

public class Dog extends Animal {
    private String strain;

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("strain:" + this.strain + " ");
    }

    @Override
    public void ab() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(strain, dog.strain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strain);
    }

    @Override
    public void eat() {
        System.out.println("吃狗粮");
        this.setHealth(this.getHealth() + 3);
        this.print();
    }

    public void CatchingFlyDisc() {
        this.setHealth(this.getHealth() - 5);
        this.setLove(this.getLove() + 5);
    }
}

