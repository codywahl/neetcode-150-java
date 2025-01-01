package neetcode150java;

// @cspell:ignore NeetCoin
/**
 * Best Time to Buy and Sell Stock
 * LeeCode 121
 * 
 * You are given an integer array prices where prices[i] is the price of
 * NeetCoin on the ith day.
 * 
 * You may choose a single day to buy one NeetCoin and choose a different day in
 * the future to sell it .
 * 
 * Return the maximum profit you can achieve. You may choose to not make any
 * transactions, in which case the profit would be 0.
 * 
 * Example 1:
 * 
 * Input: prices = [10,1,5,6,7,1]
 * 
 * Output: 6
 * Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.
 * 
 * Example 2:
 * 
 * Input: prices = [10,8,7,5,2]
 * 
 * Output: 0
 * Explanation: No profitable transactions can be made, thus the max profit is
 * 0.
 * 
 * Constraints:
 * 
 * 1 <= prices.length <= 100
 * 0 <= prices[i] <= 100
 * 
 */
/**
 * Explanation:
 * 
 * The idea is to use two pointers to traverse the array. The left pointer will
 * start at the beginning of the array, and the right pointer will start at the
 * next index. We will keep track of the maximum profit as we traverse the array
 * by taking the difference between the prices at the right and left pointers.
 * 
 * If the price at the right pointer is less than the price at the left pointer,
 * we will move the left pointer to the right pointer. Otherwise, we will update
 * the maximum profit if the difference between the prices at the right and left
 * pointers is greater than the current maximum profit.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }

        int leftPointer = 0, rightPointer = 1, maxProfit = 0;

        while (rightPointer < prices.length) {
            int leftPointerPrice = prices[leftPointer];
            int rightPointerPrice = prices[rightPointer];

            if (rightPointerPrice < leftPointerPrice) {
                leftPointer = rightPointer;
            } else {
                maxProfit = Math.max(maxProfit, rightPointerPrice - leftPointerPrice);
            }

            rightPointer++;
        }

        return maxProfit;
    }
}
