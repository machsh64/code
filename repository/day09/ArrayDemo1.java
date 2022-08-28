package day09;

/*
从键盘输入学生成绩,并找出最高分,并输出学生成绩等级.

成绩 >= 最高分-10 等级为A.
成绩 >= 最高分-20 等级为B.
成绩 >= 最高分-30 等级为C.
其余             等级为D.

*/

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数: ");
        int number = scan.nextInt();
        int[] scores = new int[number];
        System.out.println("请输入" + number + "个学生分数： ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }

       /* for (i = 0; i < scores.length - 1; i++) {               //整段用来找出最大值,并将所有值按从大到小进行排序
            for (int j = i + 1; j < scores.length; j++) {         //缺点: 文段太长,两次遍历算法效率低
                if (scores[i] < scores[j]) {
                    int t = scores[i];
                    scores[i] = scores[j];
                    scores[j] = t;                                //此时score[0]的值最大
                }
            }
        }   */

        int maxScore = 0;                                         //进行了第一次优化
        for (int i = 0; i < scores.length; i++) {                 //此时用maxScore获取了最大值
            if (maxScore < scores[i]) {                           //缺点：不能将所有分数进行从大到小的排序，
                maxScore = scores[i];                             //     显示出来的结果看上去比较杂乱
            }
        }

            /*     System.out.println();
        System.out.println(scores[0]);   // 得出最大值;
        System.out.println();
        for (i = 0; i < scores.length; i++) {    //将各个数字按从大到小排序
            System.out.println(scores[i]);
        }
   */
        for (int i = 0; i < scores.length; i++) {
            if (maxScore - scores[i] <= 10) {
                System.out.println("the number " + scores[i] + " is A");
                continue;
            }
            if (maxScore - scores[i] <= 20) {
                System.out.println("the number " + scores[i] + " is B");
                continue;
            }
            if (maxScore - scores[i] <= 30) {
                System.out.println("the number " + scores[i] + " is C");
                continue;
            }
            if (maxScore - scores[i] > 30) {
                System.out.println("the number " + scores[i] + " is D");
            }
        }

    }
}
