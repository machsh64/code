package leetcode;
/*
* 键入一个三位数,输出三位数的倒数
* 要求使用类
* */

import java.util.Scanner;
public class ThreeNumber {
    public static void main(String[] args) {

        Number test = new Number();
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        test.hundred = num/100;
        test.tens = num/10%10;
        test.single = num%10;

        //测试
        test.inFor();
    }
}

class Number{

    //属性
    int hundred;//百位数
    int tens;//十位数
    int single;//个位数

    //方法
    public void inFor(){
        System.out.println(single+"\t"+tens+"\t"+hundred);
    }
}

