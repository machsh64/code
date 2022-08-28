package day22.Polymorphism;

import day22.Polymorphism.Person;

/**
 * @author : Ren
 * @Date : 2022/06/13/19:44
 * @Param :
 */
public class Woman extends Person {
    boolean isBeauty;

    public Woman(){

    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-13  19:57
    *@Param : [goShopping]
    *@Return : void
    *
    */
    public void goShopping(){

        System.out.println("女人喜欢购物");
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-13  19:58
    *@Param : [eat]
    *@Return : void
    *
    */
    @Override
    public void eat() {
        System.out.println("女人少吃，为了减肥");
    }

    /**
    *@author : Ren
    *@Description : This is description of method
    *@Date : 2022-06-13  19:59
    *@Param : [walk]
    *@Return : void
    *
    */
    @Override
    public void walk() {
        System.out.println("女人窈窕的走路");
    }
}
