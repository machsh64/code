package day19;

import java.util.Scanner;

public class RepeatAi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("你好!我是你的回话助手");
        while (true) {
            String str = scan.next();
            try {
                str = str.replaceAll("\\?", "!");
                str = str.replaceAll("吗？", "!");
                if(str.contains("你")){            // contains自动检测语句中是否含有某个字符，
                                                   // 也可使用 if(str.indexOf("要判断的字符")>-1) ,
                                                   //  注意，此为bool类型判断，结果 是 为返回一个大于0。
                    str = str.replaceAll("你","我");
                }else {
                    str = str.replaceAll("我","你");
                }
                str = str.replaceAll("？", "!");
            } catch (Exception ignored) {
            }
            System.out.println(str);
        }
    }
}