package cn.fii.demo.entity;

public class ThiefPreventDoor extends Door implements Locker, Photos {
    @Override
    public void open() {
        System.out.println("open door");
    }

    @Override
    public void close() {
        System.out.println("close door");
    }

    @Override
    public void lock() {
        System.out.println("lock door");
    }

    @Override
    public void unlock() {
        System.out.println("unlock door");
    }

    @Override
    public void take() {
        System.out.println("take photos");
    }
}
