package neetcode150java.Stack;

import java.util.Stack;

/**
 * Daily Temperatures
 * LeetCode 739
 * 
 * You are given an array of integers temperatures where temperatures[i]
 * represents the daily temperatures on the ith day.
 * 
 * Return an array result where result[i] is the number of days after the ith
 * day before a warmer temperature appears on a future day. If there is no day
 * in the future where a warmer temperature will appear for the ith day, set
 * result[i] to 0 instead.
 * 
 * Example 1:
 * 
 * Input: temperatures = [30,38,30,36,35,40,28]
 * 
 * Output: [1,4,1,2,1,0,0]
 * Example 2:
 * 
 * Input: temperatures = [22,21,20]
 * 
 * Output: [0,0,0]
 * Constraints:
 * 
 * 1 <= temperatures.length <= 1000.
 * 1 <= temperatures[i] <= 100
 * 
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (i == 0) {
                stack.push(i);
            } else {
                int currentTemp = temperatures[i];

                while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                    int previousIndex = stack.pop();
                    result[previousIndex] = i - previousIndex;
                }

                stack.push(i);
            }
        }

        return result;
    }
}
