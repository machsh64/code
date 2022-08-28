package day28;

/**
 * @author : Ren
 * @Date : 2022/08/12/23:52
 * @Param :    static关键字的使用
 * <p>
 *           1,static: 静态的
 *           2,static可以用来修饰: 属性 ,方法 ,代码块 ,内部类
 *           <p>
 *           3,使用static修饰属性: 静态变量(或类变量)
 *             3.1 属性, 按是否使用static修饰, 又分为: 静态属性 和 非静态属性(实例变量)
 *                     实例属性: 我们创建 了类的多个对象, 每个对象都独立的拥有一套类中的非静态属性, 当修改其中一个对象中的
 *                     非静态属性时, 不会导致其他 对象中同样的属性值的修改.
 *                 静态变量: 我们创建了类的多个对象, 多个对象共享同一个静态变量, 当通过某一个对象修改静态变量时, 会导致
 *                 其他对象调用此静态变量时, 是修改过了的.
 *           3.2 static修饰属性的其他说明：
 *               ① 静态变量随着类的加载而加载。 可以通过：“类.静态变量“的方式进行调用
 *               ② 静态变量的加载要早于对象的创建
 *               ③由于类只会加载一次， 则静态变量 在内存中也只会存在一份： 存在方法区的静态域中。
 *
 *               ④           类变量       实例变量
 *               类           yes          no
 *               对象         yes          yes
 *               <p>
 * 4,使用static修饰方法:
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "US";            //静态变量的加载要早于对象的创立, 随类的加载而加载, 可以用 类.静态变量 进行调用

        System.out.println(Chinese.nation);

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;

        c1.nation = "CHN";

        System.out.println(c2.nation);

        c1.show();
    }

}

//中国人
class Chinese {
    String name;
    int age;
    static String nation;        //将nation定义为static后, 为所有实例共用, 则任意对象修改后,常量池值发生改变

    public static void show(){
        System.out.println("im chinese");
    }
}
