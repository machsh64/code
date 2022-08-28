package day22.Polymorphism;

/**
 * @author : Ren
 * @Date : 2022/06/13/19:44
 * @Param :
 */
public class Man extends Person {
    boolean isSmoking;
    int id = 1002;

    public Man(){

    }

    public void earnMoney(){

        System.out.println("男人负责挣钱养家");
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-13  19:55
    *@Param : []
    *@Return : void
    *
    */
    @Override
    public void eat() {

        System.out.println("男人多吃肉，长肌肉");
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-13  19:56
    *@Param : []
    *@Return : void
    *
    */
    @Override
    public void walk() {
        System.out.println("男人霸气的走路");
    }


}
