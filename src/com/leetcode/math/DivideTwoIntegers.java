package com.leetcode.math;
/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8,
and -2.7335 would be truncated to -2.
Return the quotient after dividing dividend by divisor.
Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
 */

public class DivideTwoIntegers {

    public static void main(String[] args) {

        int dividend = -2147483648;
        int divisor = -1;

        System.out.println(solution(dividend, divisor));
    }

    private static int solution(int dividend, int divisor) {

        int result = 0;
        int tempDividend = 0;
        int tempDivisor = Math.abs(divisor);

        if (dividend == -2_147_483_648) {
            dividend += 1;
            result++;
            tempDividend = Math.abs(dividend);
        } else {
            tempDividend = Math.abs(dividend);
        }

        while (tempDividend >= tempDivisor) {
            tempDividend -= tempDivisor;
            result++;
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            result = Math.negateExact(result);
        }

        return result;
    }
}
