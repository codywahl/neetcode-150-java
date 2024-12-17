package neetcode150java;

/**
 * Two Integer Sum II
 * Leetcode 167
 * Given an array of integers numbers that is sorted in non-decreasing order.
 * 
 * Return the indices (1-indexed) of two numbers, [index1, index2], such that
 * they add up to a given target number target and index1 < index2. Note that
 * index1 and index2 cannot be equal, therefore you may not use the same element
 * twice.
 * 
 * There will always be exactly one valid solution.
 * 
 * Your solution must use O(1) additional space.
 * 
 * Example 1:
 * 
 * Input: numbers = [1,2,3,4], target = 3
 * 
 * Output: [1,2]
 * Explanation:
 * The sum of 1 and 2 is 3. Since we are assuming a 1-indexed array, index1 = 1,
 * index2 = 2. We return [1, 2].
 * 
 * Constraints:
 * 
 * 2 <= numbers.length <= 1000
 * -1000 <= numbers[i] <= 1000
 * -1000 <= target <= 1000
 * 
 */
public class TwoIntegerSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[0];
        }

        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {
            int leftNumber = numbers[leftPointer];
            int rightNumber = numbers[rightPointer];

            int sum = leftNumber + rightNumber;
            if (sum == target) {
                // Plus 1 to make it 1-indexed as required by the problem
                return new int[] { leftPointer + 1, rightPointer + 1 };
            } else if (sum < target) {
                leftPointer++;
            } else if (sum > target) {
                rightPointer--;
            } else {
                // This should never happen since there is always exactly one valid solution
                return new int[0];
            }
        }

        // This should never happen since there is always exactly one valid solution
        return new int[0];
    }
}
