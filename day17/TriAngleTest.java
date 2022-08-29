package day17;

import day17.TriAngle;

/**
 * 编写两个类，TriAngle和TriAnTest，其中TriAngle类中声明私有的
 * 底边长base和高height，同时声明公共方法访问私有变量。此外，提供
 * 类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngleTest {
    public void show(){
        TriAngle p1 = new TriAngle();

        p1.setBase(2.0);
        p1.setHeight(2.4);
        System.out.println("高为 "+p1.getHeight()+" 长为 "+p1.getBase()+" 的三角形面积为 ：" +p1.getBase()*p1.getHeight()/2);

        TriAngle p2 = new TriAngle(4.2,2.4);

        System.out.println("高为 "+p2.getHeight()+" 长为 "+p2.getBase()+" 的三角形面积为 ：" +p2.getBase()*p2.getHeight()/2);
    }
    
}
