package cn.cusip.demo;

public class exception_3 {
    public static void main(String[] args) {
        /*
         * throw 用于方法体内代码行
         * throws 用于方法声明上，跟在方法的后面一点
         * 继承关系的快捷键 ctrl + H
         * */
        try {
            f01(-100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        f02(-100);

        System.out.println("processing ending");

    }

    public static void f01(int grade) throws Exception {
        if (grade < 0) throw new Exception("grade can't below 0");//比检异常（排除掉RuntimeException或它的子类）
        System.out.println(grade);
    }

    public static void f02(int grade) {
        if (grade < 0) throw new RuntimeException("grade can't below 0");//运行期异常
        System.out.println(grade);
    }
}
