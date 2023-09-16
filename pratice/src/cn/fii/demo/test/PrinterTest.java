package cn.fii.demo.test;

import cn.fii.demo.entity.*;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(new ColorInk(), new A4Paper());
        System.out.println(printer);

        printer.setInk(new BlankInk());
        printer.setPaper(new B5Paper());
        System.out.println(printer);
    }
}
