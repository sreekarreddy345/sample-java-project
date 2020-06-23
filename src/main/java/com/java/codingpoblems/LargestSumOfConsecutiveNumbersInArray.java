package com.java.codingpoblems;

public class LargestSumOfConsecutiveNumbersInArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print(max_SubArray(nums));
    }

    public static int max_SubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int max = nums[0];
        int end = 0;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            if (sum < 0) {
                sum = 0;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
            end++;
        }
        return max;
    }


}
