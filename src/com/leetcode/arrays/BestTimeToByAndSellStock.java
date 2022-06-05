package com.leetcode.arrays;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToByAndSellStock {

    public static void main(String[] args) {

        int[] stock = {7, 2, 4, 1};
        System.out.println(getMaxProfit(stock));
    }

    private static int getMaxProfit(int[] prices) {

        int min = prices[0];
        int minInd = 0;
        int maxInd = 0;
        int max = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minInd = i;
            }
            if (prices[i] > max && maxInd < minInd){
                max = prices[i];
                maxInd = i;
            }
        }
       if (maxInd > minInd){
           return prices[maxInd] - prices[minInd];
       } else return 0;
    }
}
