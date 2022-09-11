package day35;

/**
 * @program: code
 * @author: Ren
 * @create: 2022-09-11 14:13
 * @description:    Error：
 *                  Java虚拟机无法解决的严重问题。如：JVM系统内部错误，资源耗尽等严重情况。比如：StackOverflowError与OutOfMemoryError
 *
 *                  一般不编写针对性代码进行处理
 **/
public class ErrorTest {
    public static void main(String[] args) {
        //1，栈溢出：java.lang.StackOverflowError
      /*  main(args);*/

        //2，堆溢出：java.lang.OutOfMemoryError
      /*  Integer[] arr = new Integer[1024*1024*1024];*/

    }
}
