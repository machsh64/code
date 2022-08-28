package day07;
/*
从键盘上输入year，month，day判断是否为闰年，
并指出该日期是这一年中的第几天。
*/

import java.util.Scanner;

public class DayYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter year : ");
        int year = scan.nextInt();
        System.out.println("enter month : ");
        int month = scan.nextInt();
        System.out.println("enter day : ");
        int day = scan.nextInt();
        int sum = 0;
        int yearN = 0;
        switch (month) {
            case 12:
             sum += 30;
            case 11:
            sum += 31;
            case 10:
            sum += 30;
            case 9:
            sum += 31;
            case 8:
            sum += 31;
            case 7:
            sum += 30;
            case 6:
            sum += 31;
            case 5:
            sum += 30;
            case 4:
            sum += 31;
            case 3:
            if(year % 4 == 0&&year % 100 != 0||year % 400 == 0){
              sum += 29;
              yearN = 1;
            }else{
                sum += 28;
                yearN =0;
            }
            case 2:
            sum += 31;
            case 1:
            sum += day; 

        }
     if(yearN == 1){
        System.out.println("" + year + "年" + "是闰年 " + month + "月" + day + "日" + "是该年的第" + sum + "天");
     }else{
        System.out.println("" + year + "年" + "是平年 " + month + "月" + day + "日" + "是该年的第" + sum + "天");
     }
        scan.close();
    }

}