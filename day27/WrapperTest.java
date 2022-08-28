package day27;

import org.junit.Test;

/**
 * @author : Ren
 * @Date : 2022/08/10/17:10
 * @Param :  包装类的使用：
 * 1，java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * <p>
 * 2，掌握的：基本数据类型，包装类，String三者之间的互相转换
 */
public class WrapperTest {

    //基本数据类型 ---> 包装类：调用包装类的构造器
    @Test
    public void Test1() {
        int num1 = 10;
        /*System.out.println(num1.toString());*/
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());   //10

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());   //123
/*      报异常
        Integer in3 = new Integer("123abc");
        System.out.println(in3.toString());
*/

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);     //12.3
        System.out.println(f2);     //12.3

        Boolean b1 = new Boolean(true);   //true
        Boolean b2 = new Boolean("TrUe");
        System.out.println(b2);     //true
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);     //false

        Order order = new Order();
        System.out.println(order.isMale);    //false
        System.out.println(order.isFemale);  //null
    }

    //包装类 --->基本数据类型：调用包装类的xxxValue（）
    @Test
    public void Test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 2);
    }

    //JDK 5.0新特性: 自动装箱与自动拆箱
    @Test
    public void Test3() {
        int num1 = 10;
        //基本数据类型 --》包装类的对象
       /* Integer in1 = new Integer(num1);
        method(in1);*/

        //自动装箱：
        int num2 = 10;
        Integer in2 = num2;

        boolean b1 = true;
        Boolean b2 = b1;  //自动装箱

        //自动拆箱：包装类 ---》 基本数据类型
        System.out.println(in2.toString());

        int num3 = in2;  //自动拆箱

        Integer in3 = new Integer(12);
        int num4 = in3;  //自动拆箱

    }

    public void method(Object obj) {

    }

    //基本数据类型/包装类---> String类型: 调用String重载的valueOf(Xxx xxx)
    @Test
    public void Test4(){
        int num1 = 10;
        //方式一: 连接运算
        String str1 = num1 + "";
        //方式二:
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);  //"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);  //"12.4"
    }

    //String类型 ---> 基本数据类型/包装类: 调用包装类的parseXxx()
    @Test
    public void Test5(){
        String str1 = "123";
        //int num1 = (int)str1;
        //到基本数据类型
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);   //123

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);   //true

    }
}

class Order {
    boolean isMale;
    Boolean isFemale;
}
