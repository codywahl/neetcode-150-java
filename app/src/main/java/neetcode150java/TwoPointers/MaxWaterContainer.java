package neetcode150java.TwoPointers;

/**
 * Container With Most Water
 * LeetCode 11
 * 
 * You are given an integer array heights where heights[i] represents the height
 * of the ith bar.
 * 
 * You may choose any two bars to form a container. Return the maximum amount of
 * water a container can store.
 * 
 * Example 1:
 * 
 * Input: height = [1,7,2,5,4,7,3,6]
 * 
 * Output: 36
 * Example 2:
 * 
 * Input: height = [2,2,2]
 * 
 * Output: 4
 * Constraints:
 * 
 * 2 <= height.length <= 1000
 * 0 <= height[i] <= 1000
 */

/**
 * 
 * Explanation:
 * 
 */
public class MaxWaterContainer {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length < 2) {
            return 0;
        }

        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        do {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int minHeight = Math.min(leftHeight, rightHeight);
            int width = right - left;
            int area = width * minHeight;

            max = Math.max(max, area);

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        } while (left < right);

        return max;
    }
}
