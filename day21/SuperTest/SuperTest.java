package day21.SuperTest;

/**
 * @author : Ren
 * @Date : 2022/06/12/21:50
 * @Param :
 */
public class SuperTest {
    public static void main(String[] args) {
        Student stu = new Student();       //即使不进行任何实例化后的操作,在实例化子类时,
                                           // 调用了父类空参构造器,则空参构造器中语句产生效果

        stu.show();
        System.out.println("**************************");

        Student stu1 = new Student("IT",44);
        stu1.show();

    }
}
