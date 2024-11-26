package neetcode150java;

import java.util.HashSet;

/**
 * Contains Duplicate
 * 
 * This class provides a method to check if an integer array contains any
 * duplicate values.
 * 
 * Method:
 * - hasDuplicate(int[] nums): Given an integer array nums, returns true if any
 * value appears more than once in the array, otherwise returns false.
 * 
 * Example 1:
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 */

/**
 * Explanation:
 * Loop over each value
 * Check if the value is in the HashSet
 * If it is, return true
 * If it is not, add the value to the HashSet and continue
 * 
 * Retrieving a value from a HashSet is O(1) time complexity
 * Looping over each value in the array is O(n) time complexity
 * 
 * Time complexity: O(n)
 * When we have both a loop and a HashSet, the time complexity is O(n) because
 * the loop is the dominant factor
 * The dominant factor is the factor that grows the fastest as the input size
 * increases
 * 
 * Space complexity: O(n)
 * The space complexity is O(n) because space in a worst case scenario
 * the hash set will contain all the values (n many) in the array
 * 
 */
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) {
                return true;
            } else {
                numbers.add(num);
            }
        }

        return false;
    }
}
