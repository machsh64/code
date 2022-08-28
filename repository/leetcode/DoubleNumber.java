package leetcode;

/*
 * 给定一个整数数组nums,和一个整数目标值target,请你在该数组中
 * 找出 和为目标值 target的那 两个整数,并返回他们的数组下标.
 *
 * 你可以假设每种输入只会对应一个答案,但是,数组中同一个元素在答
 * 案里不能重复出现.
 *
 * 你可以按任意顺序返回答案.
 *
 * */

import java.util.Scanner;

public class DoubleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要输入的数字数目: ");
        int len = scan.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println("请输入整数目标值target： ");
        int target = scan.nextInt();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }

    }
}
