package day21.Override;
/*
 *   方法的重写(override/overwrite)
 *
 *   1,重写：子类继承父类以后，可以对父类中同名同参的方法，进行覆盖操作
 *
 *   2,应用：重写以后，当创建子类对象以后，通过子类对象调用父类中的同名同参的方法时，实际执行的是子类重写父类的方法
 *
 *   3,重写的规定：
 *             方法的声明：权限修饰符，返回值类型，方法名(形参列表) throws 异常的类型{
 *                   方法体
 *                   }
 *             约定俗成:子类中叫重写的方法，父类中叫被重写的方法
 *            ①子类中重写的方法的方法名和形参列表与父类中被重写的方法的方法名和形参列表相同
 *            ②子类中重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符  (private 缺省 protected public)
 *                 >特殊情况：子类不能重写父类中 private权限 的方法
 *            ③返回值类型：
 *                 >父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型必须是void
 *                 >父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A的子类
 *                 >父类被重写的方法的返回值类型是基本数据类型(double)，则子类重写的方法的返回值类型必须是相同的基本数据类型(double)
 *            ④子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 */

import day21.Override.Student;

/**
 * @author : Ren
 * @Date : 2022/06/12/9:57
 * @Param :
 */
public class PersonTest {
    public static void main(String[] args) {

        Student stu = new Student("计算机科学与技术");

        stu.eat();
        stu.walk(10);
        System.out.println();
        stu.study();
        System.out.println();
        stu.show();

    }
}
