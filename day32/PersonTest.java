package day32;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-02 23:09
 * @description:     关于抽象类的匿名子类
 **/
public class PersonTest {

    public static void main(String[] args) {

        method(new Student());  //匿名对象

        Worker worker = new Worker();
        method1(worker);    //非匿名的类，非匿名的对象  *******

        method1(new Worker());  //非匿名的类，匿名的对象   ********

        //创建了一个匿名子类的对象：p
        Person p = new Person() {    //匿名的类，非匿名的对象   *******
            @Override
            public void eat() {
                System.out.println("好好吃东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸");
            }
        };

        method1(p);   //传入了匿名子类的对象p

        System.out.println("******************");

        //创建匿名子类的匿名对象
        method1(new Person() {        //匿名的类，匿名的对象    *******
            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }

            @Override
            public void breath() {
                System.out.println("呼吸好的空气");
            }
        });
    }

    public static void method(Student s){

    }

    public static void method1(Person p){
        p.eat();
        p.breath();
    }
}

class Worker extends Person{

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}


