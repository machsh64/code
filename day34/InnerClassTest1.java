package day34;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-08 17:53
 * @description:
 **/
public class InnerClassTest1 {

    //开发中很少见
    public void method() {

        //方法体内内部类  局部内部类
        class AA {

        }
    }

    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable() {

        //创建一个实现了Comparable接口的类：局部内部类
        //方式一：非匿名的类，匿名的对象

        /*class MyComparable implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();*/

        //方式二 ：使用匿名的类的匿名对象
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }

        };
    }


}
