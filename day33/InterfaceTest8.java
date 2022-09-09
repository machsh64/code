package day33;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-08 15:49
 * @description:     JDK8：除了定义全局变量和抽象方法之外，还可以定义静态方法，默认方法
 **/
public class InterfaceTest8 {
    public static void main(String[] args) {
        SubClassTest s = new SubClassTest();

        //通过实现类的对象，可以调用接口中的默认方法
        s.method3();
        s.method2();

       /* s.method1;*/
        //接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();

    }

}

interface CompareA{
    //静态方法
    public static void method1(){
        System.out.println("method1");
    }

    //默认方法
    public default void method2(){
        System.out.println("method2");
    }

    //抽象方法
    public abstract void method3();

}

class SubClassTest implements CompareA{

    @Override
    public void method2() {
        System.out.println("method2 override");

        //要调用实现类覆盖重写的接口中的默认方法 接口名.super.方法名();
        CompareA.super.method2();
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

}
