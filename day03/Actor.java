package day03;

public class Actor {
    public static void main(String[] args) {
    byte b1 = 127;
    /*byte的定义区间在-128_+127之间,超出范围后会导致溢出 */
    System.out.println(b1);
    short b2 = 22;
    System.out.println(b2);
    int b3 = 333;
    System.out.println(b3);
    long b4 = 625;
    System.out.println(b4);
    float c1 = 233.42F;
    /*float为浮点数，但使用float的数据后必须接”F/f“*/
    System.out.println(c1);
    double c2 = 3444.34234;
    /*double也为浮点数，但double后不用接f，通常情况下浮点数都使用double，double数据范围更广数据更为准确。 */
    System.out.println(c2);
    char a1 = 'm';
    /*char为只能使用一个字母*/
    System.out.println(a1);  
    boolean isMarried = true;
    if(isMarried){
        System.out.println("you're so fucking lucky,thought i don't know it's a good thing or other\t" + true);
    }
    else{
        System.out.println("OMG it's too sed\t" + false);
    }

    }
    
}