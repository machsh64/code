package day06;
/*
假设你想开发一个玩彩票的游戏,程序随机的产生一个两位数的彩票,
提示用户输入一个两位数,然后按照下面的规则判定用户是否能赢:
1)如果用户输入的数字完全符合彩票的实际数字和顺序，奖金100000美元。
2）如果用户输入的数字完全符合彩票的数字，但顺序不同，奖金3000美元。
3）如果用户输入的数字按顺序符合彩票数字的一个，奖金1000美元。
4）如果用户输入的数字不按顺序符合彩票的一个数字，奖金500美元。
5）如果用户输入的数字没有一个符合彩票的数字，则彩票作废。
*/
import java.util.Scanner;
public class Srand {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int caiPiao = (int) (Math.random() * 90 + 10);
         int first = caiPiao / 10;
         int second = caiPiao % 10;
         System.out.println("enter your number");
         int num = scan.nextInt();
         int firstN = num / 10;
         int secondN = num % 10;
         int randN = secondN * 10 + firstN;
        if(num  ==  caiPiao){
            System.out.println("you win 10000 dallors");
        }
        if(randN == caiPiao){
            System.out.println("you win 3000 dallors");
        }
        if(first == firstN||second == secondN){
            System.out.println("you win 1000 dallors");
        }
        if(first == secondN||second == firstN){
            System.out.println("you win 500 dallors");
        }
        else{
            System.out.println("you lost the caiPiao");
        }
     scan.close();
    }
    
}