package day04;

public class Compare_2 {
    public static void main(String[] args) {
        int num1 = 42,num2 = 24, num3 = 53,max,min;
        max = num1 > num2 ? num1 : num2;
        min = num1 < num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        min = min < num3 ? min : num3;
        System.out.println("max ="+ max);
        System.out.println("min ="+ min);
    }
    
}