package leetcode;

public class Solution {
    public static void main(String[] args) {
       Solution maxx = new Solution();
       int[] nums = new int[]{1,3,6,2,3,6,4,8,4,2};
        int[] reply = new int[20];
        reply = maxx.maxSlidingWindow(nums,3);
       reply.toString();
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0;
        int[] res = new int[nums.length - k + 1];

        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        for (i = 0; i < nums.length; i++) {
            for (j = i; j < k - 1; j++) {
                int Max = Math.max(nums[j], nums[j + 1]);
                res[i] = Max;
            }

        }
        return res;
    }


}

