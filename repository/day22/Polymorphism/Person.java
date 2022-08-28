package day22.Polymorphism;

/**
 * @author : Ren
 * @Date : 2022/06/13/19:44
 * @Param :
 */
public class Person {
    int id = 1001;
    int age;
    String name;

    public Person() {

    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-13  19:49
     * @Param : []
     * @Return : void
     */
    public void eat() {

        System.out.println("人: 吃饭");
    }

    public void walk() {

        System.out.println("人： 走路");
    }


}
