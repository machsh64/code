package day14;


/*
 * 定义三个重载方法max(),
 * 第一个方法求两个int值中的最大值,
 * 第二个方法求两个double值中的最大值,
 * 第三个方法求三个double值中的最大值
 * 并分别调用三个方法
 * */

public class OverloadTest2 {
    public static void main(String[] args) {
        OverloadTest2 test1 = new OverloadTest2();

        test1.max(4, 5);
        test1.max(2.234, 2.425);
        test1.max(2.525, 2.263, 2.362);
    }

    public void max(int num1, int num2) {
        int max = Math.max(num1, num2);
        System.out.println(num1 + "和" + num2 + "中" + "max = " + max);
    }

    public void max(double num1, double num2) {
        double max = Math.max(num1, num2);
        System.out.println(num1 + "和" + num2 + "中" + "max = " + max);
    }

    public void max(double num1, double num2, double num3) {
        double max = Math.max(Math.max(num1, num2), num3);
        System.out.println(num1 + "和" + num2 + "和" + num3 + "中" + "max = " + max);
    }
}