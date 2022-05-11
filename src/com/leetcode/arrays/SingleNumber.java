package com.leetcode.arrays;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
    int[] nums = {1,3,2,1,2};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums){
        int result = 0;
        int sum = 0;
        int middle = 0;
        for (int num : nums) {
            sum += num;

        }
//        middle = sum / nums.length;
//        for (int num : nums) {
//            if (sum - num * 2 == (sum - num) ){
//            result = num;
//            break;
//            }
//        }

        return result;
    }
}
