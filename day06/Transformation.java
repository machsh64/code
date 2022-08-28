package day06;
/* 
将a，b，c，d，e转换为大写字母，其他输入显示为“other”。
*/
import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
      System.out.println("enter your character");
      Scanner scan = new Scanner(System.in);
      String word = scan.next();
      char c = word.charAt(0);
      switch(c){
       case 'a':
          case 'b':
          case 'c':
          case 'd':
          case 'e':
              c = (char)(c - 32);
       System.out.println(c);
       break;
          default:
       System.out.println("other");
       break;
      }
      scan.close();
    }

}