package day11;

public class PersonTest {
    public static void main(String[] args) {
        //创建Person的对象
        Person p1 = new Person();
        //Scanner scan = new Scanner(System.in)

        //调用对象的结构，属性，方法。
        //调用属性 ，“对象.属性”
        p1.name = "周杰伦";
        System.out.println(p1.name);
        p1.age = 40;
        System.out.println(p1.age);
        p1.isMale = true;
        System.out.println(p1.isMale);

        //调用方法 ,"对象.方法"
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        System.out.println();

        //创建一个新的对象
        Person p2 = new Person();
        System.out.println(p2.name);   //Null   因为新new了一个空间给Person,所以没有堆heap中的内容，每个对象独立拥有一套属性;
        //如果直接创建一个对象而不new
        Person p3 = p1;
        System.out.println(p3.name);   //周杰伦
        p3.age = 20;                   //对p3对应属性进行赋值更改;
        System.out.println(p1.age);    //因为p3没有拥有独立的属性，单纯将p1赋给p3，p3与p1共用一套属性，改变p3对应地址值的内容则改变了p1;

    }

}

class Person {
    //属性 Filed
    String name;
    int age = 1;
    boolean isMale;

    //方法 Method
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以对话,使用的是 " + language);
    }
}
