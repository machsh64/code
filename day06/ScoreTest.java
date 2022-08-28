package day06;

/*输入同学的成绩，100——60的输出合格，59——0的输出不合格，其他输出错误输入。 */
import java.util.Scanner;
public class ScoreTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("enter your score: ");
        int Score = scan.nextInt();
        switch(Score/10){
        case 10:
        case 9:
        case 8:
        case 7:
        case 6:
        System.out.println("合格");
        break;
        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
        System.out.println("不合格");
        break;
        default:
        System.out.println("error enter");
        }
        scan.close();
    }
    
}