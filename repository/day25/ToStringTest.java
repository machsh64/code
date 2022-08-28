package day25;

import GeneralSQL.Customer;

import java.util.Date;

/**
 * @author : Ren
 * @Date : 2022/08/09/13:43
 * @Param :Object类中toString()的使用
 *        1, 当我们输出一个对象的引用时, 实际上就是调用当前对象的toString()
 *        2, Object类中toString()的定义:
 *           public String toString(){
 *               return getClass().getName() + '@' + Integer.toHexString(hashCode());
 *           }
 *
 *        3, 像String, Date, File, 包装类等都重写了Object类中的toString()方法
 *           使得再调用对象的toString()时, 返回"实体内容"信息
 *
 *        4, 自定义类也可以重写toString()方法,当调用此方法时,返回对象的"实体内容"
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("tom",21);
        System.out.println(cust1.toString());  //GeneralSQL.Customer@1b6d3586
                                               //Customer{name='tom', age=21}
                                               // 在Customer类中重写toString()后显示实体内容
        System.out.println(cust1);  //GeneralSQL.Customer@1b6d3586
                                    ////Customer{name='tom', age=21}

        String str = new String("MM");
        System.out.println(str); //MM

        Date date = new Date(4534534534543L);
        System.out.println(date.toString());  //Mon Sep 11 08:55:34 CST 2113
    }
}
