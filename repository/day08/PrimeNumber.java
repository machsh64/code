package day08;

/*输出十万内的所有质数的个数 重重优化的最后一个版本保留*/

public class PrimeNumber {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int count = 0;
        label:
        for (int i = 2; i < 100000; i++) {   //给for语句加标签
            for (int j = 2; j <= Math.sqrt(i); j++) {    //j小于等于根号下i，直接排除大部分不符合条件的i。
                if (i % j == 0) {
                    continue label;     //如果不为质数则直接跳出本次循环（条件），继续下个数的循环
                }
            }
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("the prime number: " + count);              //9592
        System.out.println("Time : " + (end - start) + "ms");         //20ms
    }

}

/* (第一版本)
public class PrimeNumber {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int count = 0;
        boolean isFlag = true;
        for (int i = 2; i < 100000; i++) {  
            for (int j = 2; j < i; j++) {   

                if (i % j == 0) {
                    isFlag = false;
                    break;     
                }
            }
                if(isFlag == true){
                    count++;
                }
                isFlag = true;
        }

        long end = System.currentTimeMillis();
        System.out.println("the prime number: " + count);               //9592
        System.out.println("Time : " + (end - start) + "ms");          //702ms
    }

}
*/

/*
public class PrimeNumber {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int count = 0;
        label: for (int i = 2; i < 100000; i++) {   //给for语句加标签
            for (int j = 2; j < i; j++) {    
                if (i % j == 0) {
                    continue label;     //如果不为质数则直接跳出本次循环（条件），继续下个数的循环
                }
            }
                    count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("the primenumber: " + count);              //9592
        System.out.println("Time : " + (end - start) + "ms");         //795ms
    }

}
*/

