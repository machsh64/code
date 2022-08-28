package day07;

/*
输出所有的水仙花数，所谓水仙花数是指一个三位数，其各个位上数字立方和等于其本身。
*/
public class ShuiXianHua {
public static void main(String[] args) {
    for(int shui = 100;shui < 1000;shui++){
        int a = shui / 100;
        int b = shui %100/10;
        int c = shui %10;
        if(a * a * a + b * b * b + c * c * c == shui){
            System.out.println(shui);
        }
    }
}
    
}