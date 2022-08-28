package day21.Override;

/**
 * @author : Ren
 * @Date : 2022/06/12/9:51
 * @Param :
 */
public class Student extends Person {
    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习，专业是： " + major);
    }

    @Override
    public void eat() {                                //重写了父类Person中的eat方法
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show(){                                //未出现Override method in Person ，则方法未对父类重写
        System.out.println("我是一个学生");              //输出后为子类中的新方法，而非对父类中的方法的重写
    }



}
