package day22;

/**
 * @author : Ren
 * @Date : 2022/06/13/20:20
 * @Param :      多态性的使用举例一:
 */
public class AnimeTest {
    public static void main(String[] args) {

        AnimeTest test = new AnimeTest();
        test.func(new Dog());                  //   狗吃骨头
                                               //   汪 汪 汪 ！

        test.func(new Cat());                  //   猫吃鱼
                                               //   喵 喵 喵 ！

    }

    public void func(Animal animal){           // Animal animal = new Dog();       多态性的的使用
        animal.eat();
        animal.shout();
    }

}

/**
*@author : Ren
*@Description : This is description of method
*@Date : 2022-06-13  20:29
*@Param :
*@Return :
*
*/
class Animal{

    public void eat(){

        System.out.println("动物： 进食");
    }

    public void shout(){

        System.out.println("动物： 叫");
    }

}


/**
*@author : Ren
*@Description : This is description of method
*@Date : 2022-06-13  20:29
*@Param :
*@Return :
*
*/
class Dog extends Animal{

    @Override
    public void eat(){

        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {

        System.out.println("汪 汪 汪 ！");
    }

}


/**
*@author : Ren
*@Description : This is description of method
*@Date : 2022-06-13  20:30
*@Param :
*@Return :
*
*/
class Cat extends Animal{

    @Override
    public void eat() {

        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵 喵 喵 ！");
    }
}
