package day14;

/*
 * 定义三个重载方法并调用,方法名为mOL
 * >三个方法分别接收一个int参数，两个int参数，一个字符串参数，
 *分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * >在主类的main()方法中分别用参数区别调用三个方法
 * */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();

        test.mOL(3);

        test.mOL(3, 3);

        test.mOL("I Love The Ash");
    }

    public void mOL(int num) {
        System.out.println("num*num = " + (num * num));
    }

    public void mOL(int num1, int num2) {
        System.out.println("num1+num2 = " + (num1 + num2));
    }

    public void mOL(String arr) {
        System.out.println(arr);
    }
}
