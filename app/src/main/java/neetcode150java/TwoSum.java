package neetcode150java;

import java.util.HashMap;

/**
 * Two Sum
 * Leetcode 1
 * 
 * Given an array of integers nums and an integer target, return the indices i
 * and j such that nums[i] + nums[j] == target and i != j.
 * 
 * You may assume that every input has exactly one pair of indices i and j that
 * satisfy the condition.
 * 
 * Return the answer with the smaller index first.
 * 
 * Example 1:
 * 
 * Input:
 * nums = [3,4,5,6], target = 7
 * 
 * Output: [0,1]
 * Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [4,5,6], target = 10
 * 
 * Output: [0,2]
 * Example 3:
 * 
 * Input: nums = [5,5], target = 10
 * 
 * Output: [0,1]
 * Constraints:
 * 
 * 2 <= nums.length <= 1000
 * -10,000,000 <= nums[i] <= 10,000,000
 * -10,000,000 <= target <= 10,000,000
 */

/**
 * Explanation:
 * 
 * First, check the length constraints of the array.
 * If less than 2 or more than 1000, return an empty array.
 * 
 * Else, we will use a HashMap to store the numbers we have seen so far.
 * 
 * Then, we will loop over the numbers in the array.
 * For each number, we will calculate the difference between the target and the
 * current value.
 * 
 * Then, we search for the difference in the HashMap.
 * If it is there, we have found the two numbers that sum to the target.
 * 
 * Otherwise, we add the current number to the HashMap and continue looping
 * through the array.
 * 
 * If we reach the end of the array without finding the two numbers, we return
 * an empty array.
 * 
 * Time complexity: O(n)
 * We loop over the array once, so the time complexity is O(n)
 * 
 * Space complexity: O(n)
 * The space complexity is O(n) because in the worst case scenario we will store
 * all the numbers (n many) in the array in the HashMap.
 */
public class TwoSum {

    public static final int arrayLengthMin = 2;

    // Leetcode's constraints
    // public static final int arrayLengthMax = 10_000;
    // public static final int arrayValueMax = 1_000_000_000;
    // public static final int arrayValueMin = -1_000_000_000;
    // public static final int targetMax = 1_000_000_000;
    // public static final int targetMin = -1_000_000_000;

    // Neetcode's constraints
    public static final int arrayLengthMax = 1_000;
    public static final int arrayValueMax = 10_000_000;
    public static final int arrayValueMin = -10_000_000;
    public static final int targetMax = 10_000_000;
    public static final int targetMin = -10_000_000;

    public int[] twoSum(int[] nums, int target) {
        var numsLength = nums.length;

        if (numsLength < arrayLengthMin || numsLength > arrayLengthMax) {
            // invalid array length
            return new int[] {};
        }

        if (target < targetMin || target > targetMax) {
            // invalid target number
            return new int[] {};
        }

        var previousNumbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < numsLength; i++) {
            var currentNumber = nums[i];

            // invalid number found in input array
            if (currentNumber < arrayValueMin || currentNumber > arrayValueMax) {
                return new int[] {};
            }

            // The difference is the number we need to find in the array
            var difference = target - currentNumber;

            // If the difference is in the HashMap, we have found the two numbers
            if (previousNumbers.containsKey(difference)) {
                var previousIndex = previousNumbers.get(difference);
                return new int[] { previousIndex, i };
            }

            previousNumbers.put(currentNumber, i);
        }

        return new int[] {};
    }
}
