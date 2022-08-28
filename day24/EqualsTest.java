package day24;

import GeneralSQL.*;

/**
 * @author : Ren
 * @Date : 2022/08/05/12:34
 * @Param :  Object类的使用
 */
public class EqualsTest {
    public static void main(String[] args) {
        /**  ==与 equals() 的区别
         *
         * 一 ：== 运算符
         *   1, 可以使用在基本数据类型变量中
         *   2, 如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等。（不一定类型要相同）
         *      如果比较的是引用数据类型，比较两个对象的地址值是否相同。即两个引用是否指向同一个对象.
         *
         * 二 ：equals() 方法的使用
         *   1, 是一个方法，而非运算符
         *   2, 只能适用于引用数据类型
         *   3, Object类中equals()的定义：return (this == obj);
         *      说明：Object类中定义的equals()和 == 的作用是相同的， 比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
         *   4,
         *
         */

        //基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        boolean b = true;
        //System.out.println(i == b);

        char c = 10;
        System.out.println(i == c);//true

        Customer c1 = new Customer("tom",21);
        Customer c2 = new Customer("tom",21);
        System.out.println(c1 == c2);//false   ==比较两个对象地址值是否相同

        String str1 = new String("import");
        String str2 = new String("import");
        System.out.println(str1 == str2);//false

        System.out.println("*********************");
        System.out.println(c1.equals(c2));//false --> true (在Customer中重写了equals()方法)
        System.out.println(str1.equals(str2));//true
    }


}
