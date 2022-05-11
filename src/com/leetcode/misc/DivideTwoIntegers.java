package com.leetcode.misc;
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

        int dividend = 24;
        int divisor = 2;
        int result = 0;
        String dividendStr = Integer.toString(dividend);


        if (dividend >= 0) {

            int increment = 1;

            for (int i = 0; i < dividendStr.length(); i++) {
                if ((Integer.parseInt(dividendStr.substring(i, i + increment)) < divisor)) {
                    increment++;

                    int tempDividend = Integer.parseInt(dividendStr.substring(i, i + increment));
                    int divCounter = 0;

                    while (tempDividend - divCounter >= divCounter) {
                        tempDividend -= divisor;
                        divCounter++;
                    }
                    result += Math.pow(divCounter, i + divCounter);

                } else {
                    int tempDividend = Integer.parseInt(dividendStr.substring(i, i + increment));
                    int divCounter = 0;

                    while (tempDividend - divCounter >= divCounter) {
                        tempDividend -= divisor;
                        divCounter++;
                    }
                    result += Math.pow(divCounter, i + divCounter);
                }


            }
        }
        System.out.println(result);

    }


}
