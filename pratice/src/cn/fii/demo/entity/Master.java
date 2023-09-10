package cn.fii.demo.entity;

public class Master {

    public void feed(Animal animal) {
        animal.eat();
    }

    public Animal adopt(String typeId) {
        Animal animal = null;
        switch (typeId) {
            case "1":
                animal = new Dog();
                break;
            case "2":
                animal = new Penguin();
                break;
        }
        return animal;
    }
}
