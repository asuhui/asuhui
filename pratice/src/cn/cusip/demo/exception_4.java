package cn.cusip.demo;

public class exception_4 {
    public static void main(String[] args) {
        try {
            f01("women");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void f01(String sex) throws MyException {
        if (!"man".equals(sex)) throw new MyException("sex uncorrected");
        System.out.println("ending!");
    }
}
