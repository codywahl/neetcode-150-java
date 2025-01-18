package neetcode150java.ArraysAndHashing;

/**
 * ProductOfArrayExceptSelf
 * Leetcode #238
 * 
 * Given an integer array nums, return an array output where output[i] is the
 * product of all the elements of nums except nums[i].
 * 
 * Each product is guaranteed to fit in a 32-bit integer.
 * 
 * Follow-up: Could you solve it in O(n) time without using the division
 * operation?
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,4,6]
 * Output: [48,24,12,8]
 * 
 * Example 2:
 * 
 * Input: nums = [-1,0,1,2,3]
 * Output: [0,-6,0,0,0]
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 1000
 * -20 <= nums[i] <= 20
 * 
 */

/**
 * Explanation:
 * We can solve this problem by calculating the prefix and suffix products of
 * the array.
 * 
 * We will create two arrays, prefix and suffix.
 * 
 * The prefix array will store the product of all the elements to the left of
 * the current element.
 * 
 * The suffix array will store the product of all the elements to the right of
 * the current element.
 * 
 * Finally, we will calculate the product of the prefix and suffix arrays to get
 * the result.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        var length = nums.length;
        var prefix = new int[length];
        var suffix = new int[length];
        var result = new int[length];

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                prefix[i] = 1;
            } else {
                prefix[i] = prefix[i - 1] * nums[i - 1];
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1) {
                suffix[i] = 1;
            } else {
                suffix[i] = suffix[i + 1] * nums[i + 1];
            }
        }

        for (int i = 0; i < length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
