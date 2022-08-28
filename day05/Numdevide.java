package day05;

/*声明两个double型变量，并赋值，判断两数，如果第一个数大于10.0，
且第二个数小于20.0，打印两数之和，否则打印两数乘积。 */

import java.util.Scanner;
public class Numdevide {
   public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("enter the first number :");
    double num1 = scan.nextDouble();
    System.out.println("enter the scend number :");
    double num2 = scan.nextDouble();
    if(num1>=10.0){
        if(num2<=20.0&&num2>0){
            System.out.println("num1 + num2 = "+ (num1+num2));
        }else{
            System.out.println("num1 * num2 = "+ num1*num2);
        }
    }else{
        System.out.println("num1 * num2 = "+ num1*num2);
    }
     scan.close();  
   }
    
}