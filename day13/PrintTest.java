package day13;

/*
3.1编写程序，声明一个method方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法。

3.2修改上一个程序，在method方法中， 除打印一个10*8的*型矩形外，再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

3.3修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，并计算该矩形的面积，将其作为方法返回值。 在main方法中调用该方法，接收返回的面积值并打印。
 */
public class PrintTest {
    public static void main(String[] args) {
        PrintTest test = new PrintTest();
        //3.1 测试
        //test.method();

     /* //3.2 测试
        //方法一：
        int area = test.method();
        System.out.println("矩阵的面积为 ："+area);
        System.out.println("********************************");
        //方法二：
        System.out.println(test.method());
    */

        //3.3 测试
        int area = test.method(9, 9);
        System.out.println("矩阵的面积为 :" + area);
    }
//3.1
   /* public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

//3.2
 /*         public int method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;
    }*/

    //3.3
    public int method(int m, int n) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}

