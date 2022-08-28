package day05;

/*
大家都知道，男大当婚，女大当嫁，那么女方家长要嫁女儿，当然要提出一定的条件，
高：180cm以上，富：财富一千万以上，帅：是。
如果这三个条件同时满足，则：“我一定要嫁给他！！！”
如果这三个条件有为真的情况下，则：“嫁吧，比上不足，比下有余。”
如果三个条件都不满足，则：“不嫁！”
*/
import java.util.Scanner;
public class IsLove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input your height: (cm)");
        int Height  = scan.nextInt();
        System.out.println("input your wealth: (million)");
        double Wealth = scan.nextDouble();
        System.out.println("你帅吗？(ture/false)");
        boolean isHandsome = scan.nextBoolean();
        int num = 0;
        if(Height >= 180){
            num++;
            if(Wealth>=1000){
                num++;
                if(isHandsome){
                    num++;
                }
            }
        }
        if(num==3){
            System.out.println("我一定要嫁给他！！！");
        }else if(num==2||num==1){
            System.out.println("比上不足比下有余。");
        }else{
            System.out.println("不嫁！");
        }

        scan.close();
    }
    
}