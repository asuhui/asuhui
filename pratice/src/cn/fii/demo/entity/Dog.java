package cn.fii.demo.entity;

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
}

