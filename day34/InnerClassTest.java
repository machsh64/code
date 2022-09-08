package day34;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-08 17:52
 * @description: 类的内部成员之五：内部类
                   1，Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 *
 *                 2，内部类的分类：成员内部类（静态，非静态） vs 局部内部类（方法内，代码块内，构造器内）
 *
 *                 3，成员内部类：
 *                     一方面，作为外部类的成员：
 *                          >调用外部类的结构
 *                          >可以被static修饰
 *                          >可以被4种不同的权限修饰
 *
 *                          另一方面，作为一个类：
 *                             >类内可以定义属性，方法，构造器等
 *                             >可以被final修饰，表示此类不能被继承，言外之意，不适用final就可以被继承
 *                             >可以被abstract修饰
 *
 *                 4，主要关注点：
 *                    4.1 如何实例化成员内布类的对象
 *                    4.2 如何在成员内部类中区分调用外部类的结构
 *                    4.3 开发中局部内部类的使用，见 InnerClassTest1.java
 **/
public class InnerClassTest {
    public static void main(String[] args) {

       Person.Dog dog = new Person.Dog();
       dog.show();

       Person p = new Person();
       Person.Bird bird = p.new Bird();

       bird.sing();
       bird.display("叽叽");

    }

}

class Person {
    String name = "人";

    //静态成员内布类
    static class Dog {
        String name;
        int age;

        public void show() {
            System.out.println("我是一只狗");

            //静态成员内部类只能调用静态方法
            /* eat();*/
        }

    }

    class Bird {
        String name = "牡丹";

        public Bird() {

        }

        public void sing() {
            System.out.println("我是一只小小鸟~");
            eat();
            Person.this.eat();
        }

        public void eat() {
            System.out.println("小鸟吃米");
        }

        public void display(String name) {
            System.out.println(name);  //形参值传递的name
            System.out.println(this.name); //小鸟的name
            System.out.println(Person.this.name);  //Person的name


        }

    }

    public void eat() {
        System.out.println("吃饭");
    }

}
