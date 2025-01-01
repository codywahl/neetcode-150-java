package neetcode150java;

/**
 * TrappingRainWater
 * LeeCode 42
 * 
 * You are given an array non-negative integers height which represent an
 * elevation map. Each value height[i] represents the height of a bar, which has
 * a width of 1.
 * 
 * Return the maximum area of water that can be trapped between the bars.
 * Input: height = [0,2,0,3,1,0,1,3,2,1]
 * 
 * Output: 9
 * Constraints:
 * 
 * 1 <= height.length <= 1000
 * 0 <= height[i] <= 1000
 */

/**
 * Explanation:
 * 
 * The idea is to use two pointers to traverse the array. The left pointer will
 * start at the beginning of the array, and the right pointer will start at the
 * end of the array. We will also keep track of the maximum height on the left
 * and right side of the array. As we traverse the array, we will calculate the
 * trapped water at each index by taking the minimum of the maximum height on
 * the left and right side of the array and subtracting the height of the
 * current index. If the trapped water is negative, we will set it to 0. We will
 * then move the pointer with the smaller maximum height to the next index and
 * repeat the process until the two pointers meet.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class TrappingRainWater {
    int leftMax = 0, rightMax = 0;

    public int trap(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int leftPointer = 0, rightPointer = height.length - 1;
        int trappedWater = 0;

        while (leftPointer < rightPointer) {
            int leftHeight = height[leftPointer];
            int rightHeight = height[rightPointer];

            setMaxes(leftHeight, rightHeight);

            if (leftMax >= rightMax) {
                rightPointer--;
                trappedWater += calculateTrappedWater(rightHeight);
            } else {
                leftPointer++;
                trappedWater += calculateTrappedWater(leftHeight);
            }
        }

        return trappedWater;
    }

    public void setMaxes(int leftValue, int rightValue) {
        if (leftValue > leftMax) {
            leftMax = leftValue;
        }

        if (rightValue > rightMax) {
            rightMax = rightValue;
        }
    }

    public int calculateTrappedWater(int value) {
        int lowestMax = Math.min(leftMax, rightMax);
        int trappedWater = lowestMax - value;

        if (trappedWater < 0) {
            trappedWater = 0;
        }

        return trappedWater;
    }
}
