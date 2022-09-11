package day35;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-11 14:12
 * @description:     一：异常体系结构
 *
 *                java.lang.throwable
 *                   |-------java.lang.Error：一般不编写针对性代码进行处理
 *                   |-------java.lang.Exception：可以进行异常的处理
 *                       |------编译时异常（checked）
 *                            |------IOException
 *                                |------FileNotFoundException
 *                            |------ClassNotFoundException
 *                       |------运行时异常（unchecked）
 *                            |------NullPointerException
 *                            |------ArrayIndexOutOfBoundsException
 *                            |------ClassCastException
 *                            |------NumberFormatException
 *                            |------InputMismatchException
 *                            |------ArithmeticException
 *
 *
 *     面试题：常见的异常都有那些？举例说明
 *
 **/
public class ExceptionTest {
    //***********************以下是编译时异常**************************

    @Test
    public void test6() {
   /*     File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1){
            System.out.print((char)data);
            data = fis.read();
        }

        fis.close();
*/
    }

    //***********************以下是运行时异常**************************

    //NullPointerException
    @Test
    public void test(){

       /* int[] arr= new int[3];
        System.out.println(arr[3]);*/    //数组角标越界  java.lang.ArrayIndexOutOfBoundsException

      /*  int[] arr = null;
        System.out.println(arr[1]);*/    //空指针

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));   //空指针
    }

    //ArrayIndexOutOfBoundsException    数组角标越界
    @Test
    public void test1(){

        /*int[] arr= new int[3];
        System.out.println(arr[3]);*/      //java.lang.ArrayIndexOutOfBoundsException

        String str = "abc";
        System.out.println(str.charAt(3));      //java.lang.StringIndexOutOfBoundsException
    }

    //ClassCastException    数据转换异常
    @Test
    public void test2(){

        Object obj = new Date();
        String str = (String)obj;  //java.lang.ClassCastException
    }

    //NumberFormatException     数字格式化异常
    @Test
    public void test3(){

        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);     // java.lang.NumberFormatException
    }

    //InputMismatchException    输入异常
    @Test
    public void test4(){

        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();      //非数字类  S
        System.out.println(score);       //java.util.InputMismatchException
    }

    //ArithmeticException    算术异常
    @Test
    public void test5(){

        int a = 5;
        int b = 0;
        System.out.println(a/b);  //java.lang.ArithmeticException
    }
}
