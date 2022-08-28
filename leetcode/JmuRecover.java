package leetcode;

/*
 * 输入n表示接下来将输入n行字符串,然后输入n行字符串,
 * 每行如果有两个元素相同,则判定改行为重复行,返回为true+1,
 * 否则返回false+1.
 * 输入样式
 * 5
 * 1 2 3 4 5
 * 1 3 2 4 5
 * 1 2 3 6 1
 * 1 2 3 2 1
 * 1 1 1 1 1
 * 输出样例
 * True=3,False=2
 * */

import java.util.Arrays;
import java.util.Scanner;

public class JmuRecover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("键入要输入字符串的行列 :");
        int n = scan.nextInt();
        int recNum = 0, fasNum = 0;
        int[][] rec = new int[n][n];
        System.out.println("键入每个数字，空格键结束单次读取，共读取 " + n * n + " 个字符串");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rec[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(rec[i]));
            Arrays.sort(rec[i]);
        }
        label:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (rec[i][j] == rec[i][j + 1]) {
                    recNum++;
                } else {
                    fasNum++;
                }
                continue label;
            }
        }
        System.out.println("True=" + recNum + ",False=" + fasNum);
    }
}
