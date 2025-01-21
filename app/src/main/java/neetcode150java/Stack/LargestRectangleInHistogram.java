package neetcode150java.Stack;

import java.util.Stack;

/**
 * Largest Rectangle In Histogram
 * Leetcode 84
 * 
 * You are given an array of integers heights where heights[i] represents the
 * height of a bar. The width of each bar is 1.
 * 
 * Return the area of the largest rectangle that can be formed among the bars.
 * 
 * Note: This chart is known as a histogram.
 * 
 * Example 1:
 * 
 * Input: heights = [7,1,7,2,2,4]
 * 
 * Output: 8
 * Example 2:
 * 
 * Input: heights = [1,3,7]
 * 
 * Output: 7
 * Constraints:
 * 
 * 1 <= heights.length <= 1000.
 * 0 <= heights[i] <= 1000
 * 
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;

        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return heights[0];
        }

        int maxArea = Integer.MIN_VALUE;
        Stack<HistogramBar> heightsStack = new Stack<>();

        // Loop through the heights array
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                int currentHeight = heights[i];

                // handle case while current height > previous heights...
                int startIndex = i;
                while (!heightsStack.isEmpty() && currentHeight < heightsStack.peek().height) {
                    HistogramBar popped = heightsStack.pop();
                    int width = i - popped.index;
                    int currentArea = popped.height * width;
                    if (currentArea > maxArea) {
                        maxArea = currentArea;
                    }

                    startIndex = popped.index;
                }

                heightsStack.push(new HistogramBar(currentHeight, startIndex));

            } else {
                heightsStack.push(new HistogramBar(heights[i], i));
            }
        }

        // loop through remaining heights in stack
        while (!heightsStack.isEmpty()) {
            HistogramBar popped = heightsStack.pop();
            int width = length - popped.index;
            int currentArea = popped.height * width;
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }

        return maxArea;
    }
}

class HistogramBar {
    int height;
    int index;

    public HistogramBar(int height, int index) {
        this.height = height;
        this.index = index;
    }
}
