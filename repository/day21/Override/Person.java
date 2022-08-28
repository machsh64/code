package day21.Override;

/**
 * @author : Ren
 * @Date : 2022/06/12/9:52
 * @Param :
 */
public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk(int distance) {
        System.out.println("行走,走了" + distance + "公里");
        eat();        //重写后此处显示的是 子类中重写的方法
        show();       //未重写成功，则此处显示的是父类中的方法

    }

    private void show(){
        System.out.println("我是一个人");
    }


}
