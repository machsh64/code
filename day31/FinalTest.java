package day31;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-01 14:56
 * @description: final:
 *                1, final可以用来修饰的结构： 类， 方法， 变量
 *
 *                2，final 用来修饰一个类：此类不能被其他类所继承
 *                   比如：String类，System类，StringBuffer类
 *
 *                3，final 用来修饰方法：表明此方法不可以被重写
 *                   比如：Object类中的getClass（）
 *
 *                4，final 用来修饰变量：此时的“变量”就称为是一个常量
 *                    4.1 final 修饰属性：可以考虑赋值的位置有：显式初始化，代码块中初始化，构造器中初始化
 *                    4.2 final 修饰局部变量：
 *                          尤其是使用final修饰形参时，表明此形参是一个常量、当我们调用此方法时，给常量形参赋一个实参。
 *                          一旦赋值以后，就只能在此方法体内使用此形参，但不能进行重新赋值。
 *
 *                   static final ：用来修饰属性：全局常量
 **/
public class FinalTest {

    final int WIDTH = 10;
    final int LEFT;
    final int RIGHT;
/*
    final int DOWN;
*/

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public FinalTest(int n){
        RIGHT = n;
    }

 /*   public void setDOWN(int down){
        this.DOWN = down;
    }*/


    public void doWidth(){
       /* width = 20;*/    //此时width变量不可以在被更改，width成为常量
    }

    public void show(){
        final int NUM = 10;   //常量
       /* NUM = 20;*/
    }

    public void show(final int NUM){
        /*NUM = 20;*/
        System.out.println(NUM);
    }

    public static void main(String[] args) {
        int num = 10;
        num = num + 5;

        FinalTest test = new FinalTest();
        /*test.setDOWN(3);*/

        test.show(10);
    }

}

//结构中的final
final class A {

}

/*class B extends A{      被final修饰的类不能够被其他类所继承
}*/

//方法中的final
class AA {
    public final void show() {

    }
}

class BB extends AA {
   /* @Override
    public void show() {           被final修饰后不可以被重写
        super.show();
    }*/
}
