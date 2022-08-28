package day03;
public class varAble {
    public static void main(String[] args) {
        String b1 = "hahaha";
        /*String常量只能赋予String常量,且进行的运算中"+"只能为连接字符 */
        char c1 = 'a';
        /*运算中，使用了String的运算，输出常量自动转换为String */
        String b2 = b1 + "\t" + c1;    
        System.out.println(b2);
    }
}