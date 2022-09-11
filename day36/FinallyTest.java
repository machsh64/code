package day36;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-11 15:57
 * @description:     try-catch-finally中finally的使用
 *
 *                   1，finally是可选的
 *                   2，finally中声明的是一定会被执行的代码，即使catch中又出现了异常，try中有return语句，catch中有return语句等情况
 *                   3，像数据库连接，输入输出流，网络编程Socket等资源，JVM是不能自动回收的，我们需要自己手动的进行资源的释放。
 *                                                                                此时的资源释放，就需要声明在finally中。
 *                   4，try-catch-finally结构可以嵌套
 *
 **/
public class FinallyTest {

    @Test
    public void testfile() {
        FileInputStream fis = null;
        try {
            File file = new File("D:/idea/code/day36/hello1.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (fis != null)      //设立 防止文件未找到时，执行关闭文件，导致的空指针异常（fis未找到，则fis.txt == null）
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



    @Test
    public void testMethod(){
       int num = method();
       System.out.println(num);
    }

    public int method(){
        try{
            int[] arr = new int[3];
            System.out.println(arr[3]);
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally{
            System.out.println("i must be running");
        }
    }

    @Test
    public void test(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
           /* e.printStackTrace();*/
            int[] arr = new int[2];
            System.out.println(arr[2]);
        }catch (Exception e){
            e.printStackTrace();
        }
       /* System.out.println("end of Running");*/
        finally {
            System.out.println("end of Running");
        }
    }
}
