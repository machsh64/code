package day36;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-11 15:15
 * @description:    一：异常的处理：抓抛模型
 *
 *                      过程一：“抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，
 *                             并将此对象抛出。
 *                             一旦抛出对象以后，其之后的代码就不再执行。
 *
 *                      过程二：“抓”：可以理解为异常的处理方式：① try - catch - finally  ② throws
 *
 *                  二：try - catch - finally的使用
 *
 *                      try{
 *                          //可能出现的异常
 *
 *                      }catch(异常类型1 变量名1){
 *                          //处理异常的方式1
 *                      }catch(异常类型2 变量名2){
 *                          //处理异常的方式2
 *                      }catch(异常类型3 变量名3){
 *                         //处理异常的方式3
 *                      }
 *                    ......
 *                    finally{
 *                        //一定会执行的代码
 *                    }
 *
 *                    说明：
 *                         1，finally是可选的
 *                         2，使用try将可能出现的异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，
 *                            根据此对象的类型，去catch中进行匹配
 *                         3，一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，一旦处理完成，就跳出当前的
 *                            try - catch 结构（在没有写finally的情况），继续执行其之后的代码
 *                         4，catch中的异常类型如果没有子夫类关系，则谁声明在上，谁声明在下无所谓。
 *                            catch中的异常类型如果满足子夫类关系，则要求子类一定要声明在父类的上面。否则，报错
 *                         5，常用的异常对象处理的方式：① String getMessage()   ② printStackTrace()
 *                         6，在try结构中声明的变量，在出了try之后就不能再被调用
 *                         7，try-catch-finally结构可以嵌套
 *
 *
 *                         体会1：使用try - catch - finally处理编译时异常，使得程序在编译时就不再报错，但是运行时仍可能报错，
 *                              相当于我们使用try - catch - finally将一个编译时可能出现的异常，延迟到运行时出现。
 *                         体会2：开发中，由于运行时异常比较常见，
 *                               所以通常不针对运行时异常编写try-catch-finally
 *                               针对于编译时异常，一定要考虑异常的处理
 *
 **/
public class ExceptionTest {

    //NumberFormatException     数值转换异常
    @Test
    public void test(){
/*
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);     // java.lang.NumberFormatException*/

            String str = "123";
            str = "abc";
            try{
                int num = Integer.parseInt(str);     // java.lang.NumberFormatException   可能出现的异常

                System.out.println("hello ....1");     //没有被输出  一旦在try里抓到异常，其之后代码不再进行
            }catch (NullPointerException e){
                System.out.println("出现了空指针异常......");
            }catch (NumberFormatException e){            //异常类型 变量名

                System.out.println("出现了数值转换异常......");    //处理异常的方式

                //String getMessage()
                System.out.println(e.getMessage());   //For input string: "abc"

                //printStacktrace();
                e.printStackTrace();
            }

        System.out.println("hello ....2");       //异常被处理后，继续执行后边代码
    }

    @Test
    public void test1() {
        try {
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
