package day33;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-04 15:29
 * @description:  接口的使用
 *                1，接口使用interface来定义
 *                2，Java中，接口和类是并列的两个结构
 *                3，如何定义接口：定义接口中的成员
 *                    3.1 JDK7及以前：只能定义全局常量和抽象方法
 *                       >全局变量：public static final的，但是书写时，可以省略不写
 *                       >抽象方法：public abstract的
 *                    3.2 JDK8：除了定义全局变量和抽象方法之外，还可以定义静态方法，默认方法
 *
 *                4，接口中不能定义构造器
 *
 *                5，Java开发中，接口通过让类去实现（implements）的方式来使用
 *                   如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *                   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *
 *                6，Java可以实行多接口：弥补了Java单继承性的局限性
 *                   格式：class AA extend BB implements CC,DD,EE{}
 *
 *                7，接口与接口之间可以继承，而且可以多继承
 *
 *                ***************************
 *                8，接口的具体使用，体现多态性
 *                9，接口，实际上可以看作是一种规范
 *
  **/
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();

        plane.fly();
        plane.stop();
        plane.attack();

    }

}

//飞行接口
interface Flyable{
    public final int MAX_SPEED = 7900;
    //省略 public final
    int MIN_SPEED = 1;

    public abstract void fly();
    //省略 public abstract
    void stop();

    //接口中不能有构造器construct
    /*public Flyable(){

    }*/

}

//攻击接口
interface Attackable {
    public abstract void attack();

}

//接口通过类实现（implements），多个接口的实现之间添加“,”
class Plane extends Object implements Flyable,Attackable{

    @Override
    public void fly() {
    System.out.println("飞机助跑起飞");
    }

    @Override
    public void stop() {
    System.out.println("驾驶员操作降落");
    }

    @Override
    public void attack() {
        System.out.println("驾驶员驾驶飞机攻击");
    }
}
