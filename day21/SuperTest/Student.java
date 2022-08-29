package day21.SuperTest;

/**
 * @author : Ren
 * @Date : 2022/06/12/21:50
 * @Param :
 */
public class Student extends Person{
    String major;
    int age;

    public Student(){

    }

    public Student(String major,int age){
        super("贾宝玉");    //使用super(参数列表)语句还可以调用父类中 带参构造器
        this.major = major;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("学生长身体，要多吃营养食品");
    }

    public void show(){
        eat();
        super.eat();
        walk();
        System.out.println("姓名："+name+"   年龄："+age+"   父类中的年龄是："+super.age+"   专业："+major);
    }

}

