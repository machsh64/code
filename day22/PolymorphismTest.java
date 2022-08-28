package day22;


import java.util.Random;

/**
 * @author : Ren
 * @Date : 2022/06/14/0:08
 * @Param :        对于多态 是 运行时行为 的验证
 */
public class PolymorphismTest {

    public static Animal1 getInstance(int key) {

        switch (key) {
            case 0:
                return new Cat1();
            case 1:
                return new Sheep1();
            default:
                return new Dog1();
        }

    }

    public static void main(String[] args) {

        int key = new Random().nextInt(3);


        Animal1 animal1 = getInstance(key);     //利用随机数进行 对象实例化的随机选择 由此得出 多态是 运行时行为 而非 编译时行为
        animal1.eat();                    //
        animal1.shout();                  //
    }

}

/**
*@author : Ren
*@Description : This is description of method
*@Date : 2022-06-14  00:22
*@Param : 动物的大类 父类
*@Return :
*
*/
class Animal1{

    public void shout(){

        System.out.println("动物会叫");
    }

    public void eat(){

        System.out.println("动物要进食");
    }
}

/**
 *@author : Ren
 *@Description : This is description of method
 *@Date : 2022-06-14  00:14
 *@Param : 猫的类
 *@Return :
 *
 */
class Cat1 extends Animal1{

    @Override
    public void shout() {

        System.out.println("猫叫: 喵喵喵");
    }

    @Override
    public void eat() {

        System.out.println("猫吃鱼肉");
    }
}

/**
*@author : Ren
*@Description : This is description of method
*@Date : 2022-06-14  00:14
*@Param : 羊的类
*@Return :
*
*/
class Sheep1 extends Animal1{

    @Override
    public void shout() {

        System.out.println("羊叫： manmanman~");
    }

    @Override
    public void eat() {

        System.out.println("羊吃青草");
    }
}

/**
*@author : Ren
*@Description : This is description of method
*@Date : 2022-06-14  00:16
*@Param : 狗的类
*@Return :
*
*/
class Dog1 extends Animal1{

    @Override
    public void shout() {

        System.out.println("狗叫: 汪汪汪");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
