package day15;


/**
 * 递归:
 * 1, 一个方法体内调用它自身
 * 2, 方法递归包含了一种隐式的传递,它会重复执行某段代码,但这种重复执行无须循环控制
 *    递归一定要向已知方向递归,否则这种递归就变成了无穷递归,类似于死循环
 *
 * 递归练习
 */

public class Recursion {
    public static void main(String[] args) {
        Recursion test = new Recursion();
        int sum = test.getSum(100);
        double sum1 = test.getSum1(4);
        int sum2 = test.getSum2(10);
        int sum3 = test.getSum3(10);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    /**
     * 例一： 计算1到n之间所有自然数的和
     */

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    /**
     * 例二： 计算1到n之间所有自然数的乘积
     */

    public double getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }

    /**
     * 例三: 已知有一个数列 : f(0) = 1,f(1) = 4,f(n+2) = 2*f(n+1) + f(n),
     * 其中n是大于0的整数,求 f(10)的值。
     */

    public int getSum2(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*getSum2(n-1)+getSum2(n-2);
        }
    }

    /**
     * 例四: 计算斐波那契数列的第n个值
     * 1 1 2 3 5 8 13 21 34 55
     * 规律： 一个数等于前两个数之和
     */

    public int getSum3(int n){
        if (n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else {
            return getSum3(n-1)+getSum3(n-2);
        }
    }
}
