package day21.SuperTest;

/**
 * @author : Ren
 * @Date : 2022/06/12/21:50
 * @Param :
 */

public class Person {
    String name;
    int age = 22;

    public Person(){
        System.out.println("这是父类Person的空参构造器中的语句，以此来展示子类实例化的过程");
    }

    public Person(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭，人要吃饭");
    }

    public void walk(){
        System.out.println("走路，人要走路");
    }

}
