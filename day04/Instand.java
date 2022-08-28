package day04;
public class Instand {
 public static void main(String[] args) {
     int num1 = 32,num2 = 44,len;
     System.out.println("num1 ="+ num1);
     System.out.println("num2 ="+ num2);
     len = num1;
     num1 = num2;
     num2 = len;
     System.out.println("num1 ="+ num1);
     System.out.println("num2 ="+ num2);
 }    
}