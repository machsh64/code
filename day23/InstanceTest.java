package day23;

import java.util.Random;

/**
 * @author : Ren
 * @Date : 2022/06/16/22:02
 * @Param :
 */
public class InstanceTest {

    public static Person getInstance(int key) {

        switch (key) {
            case 0:
                return new Person();
            case 1:
                return new Student();
            default:
                return new Graduate();
        }
    }

    public static void main(String[] args) {

        int key = new Random().nextInt(3);
        Person e = getInstance(key);
        System.out.println(e.getInfo());

    }

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-16  22:12
     * @Param : [e instanceof Person> ;getInfo() ]
     * @Return : void
     */
    public void method(Person e) {

        if (e instanceof Person) {

            System.out.println("a Person");
        }

        if (e instanceof Student) {

            System.out.println("a Student");
            method(new Person());
        }

        if (e instanceof Graduate) {

            System.out.println("a graduated student");
            method(new Student());
        }

    }


}

/**
 * @author : Ren
 * @Date : 2022/06/16/21:59
 * @Param :
 */
class Person {

    protected String name = "Person";
    protected int age = 50;

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-16  22:04
     * @Param : [return name + age]
     * @Return : java.lang.String
     */
    public String getInfo() {

        return "Name: " + name + "\n" + "age:" + age;
    }

}

/**
 * @author : Ren
 * @Date : 2022-06-16  21:59
 * @Param :
 */
class Student extends Person {

    protected String school = "pku";

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-16  22:06
     * @Param : [return name + age + school]
     * @Return : java.lang.String
     */
    @Override
    public String getInfo() {

        return super.getInfo() + "\nschool:" + school;
    }
}

/**
 * @author : Ren
 * @Date : 2022-06-16  22:00
 * @Param :
 */
class Graduate extends Student {

    public String major = "IT";

    /**
     * @author : Ren
     * @Description : This is description of method
     * @Date : 2022-06-16  22:08
     * @Param : [return name + age + school + major]
     * @Return : java.lang.String
     */
    @Override
    public String getInfo() {
        return super.getInfo() + "\nmajor:" + major;
    }
}


