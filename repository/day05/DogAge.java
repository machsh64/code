package day05;
/*
狗的前两年每一年相当于人类的10.5岁，之后的每一年
相当于人类的4岁，设计输入狗的年龄转化成人类的年龄。
*/
import java.util.Scanner;
public class DogAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the dog'age :");
        double DogAge = scan.nextDouble();
        if(DogAge>2){
            System.out.println("dog's age in person is :"+ (10.5*2+(DogAge-2)*4));
        }else{
            System.out.println("dog's age in person is :"+ DogAge*10.5);
        }
        scan.close();
    }
    
}