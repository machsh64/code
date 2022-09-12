package day37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-12 14:14
 * @description:       异常处理的方式二：throws + 异常类型
 *
 *                    1，“throws + 异常类型”写在方法的声明处。
 *                       指明此方法执行时，可能会抛出的异常类型，此对象满足throws后异常类型时，就会被抛出。
 *                       异常代码后续的代码，就不会再执行
 *                    2，体会：try-catch-finally：真正将异常给处理掉了。
 *                            throws的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉。
 *
 *                    3，开发中如何选择使用try-catch-finally 还是使用throws？
 *                      3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果
 *                          子类重写的方法中有异常，必须使用try-catch-finally方式处理。
 *                      3.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws
 *                          的方式进行处理，而执行的方法a可以考虑使用try-catch-finally方式进行处理。
  **/
public class ExceptionThrows {
    public static void main(String[] args) {

        try{
            method2();
        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void method3(){
        try {
            method2();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void method2()throws IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("d:/idea/code/day36/hello1.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }

        fis.close();
    }
}
