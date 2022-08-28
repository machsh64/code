package day04;

public class Compare {
    public static void main(String[] args) {
        int num1 = 33,num2 = 34,num3 = 53,max,min;
        if(num1 > num2){
           max = num1;
           min = num2;
        }else{
           max = num2;
           min = num1;
        }
        if(max > num3){
            System.out.println("max = "+ max);
        }else{
            System.out.println("max = "+ num3);
        }
        if(min > num3){
            System.out.println("min ="+ num3);
        }else{
            System.out.println("min = "+ min);
        }

    }
    
}