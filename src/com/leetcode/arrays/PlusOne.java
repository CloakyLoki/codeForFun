package com.leetcode.arrays;

import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any
leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        double inputSum = 0;
        for (int i = 0; i < digits.length; i++) {
            inputSum += digits[i] * Math.pow(10, (digits.length - i - 1));
        }
        inputSum++;
        String temp = Double.toString(inputSum);
        int[] resultArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            resultArray[i] = temp.charAt(i) - '0';
        }
        return resultArray;
    }
}