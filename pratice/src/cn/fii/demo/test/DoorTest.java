package cn.fii.demo.test;

import cn.fii.demo.entity.ThiefPreventDoor;

public class DoorTest {
    public static void main(String[] args) {
        ThiefPreventDoor tpd = new ThiefPreventDoor();
        tpd.open();
        tpd.close();
        tpd.lock();
        tpd.unlock();
        tpd.take();
    }
}
