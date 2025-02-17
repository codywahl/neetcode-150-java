package neetcode150java.BinarySearch;

/**
 * Binary Search
 * Leetcode 704
 * 
 * You are given an array of distinct integers nums, sorted in ascending order,
 * and an integer target.
 * 
 * Implement a function to search for target within nums. If it exists, then
 * return its index, otherwise, return -1.
 * 
 * Your solution must run in O(log n) time.
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,2,4,6,8], target = 4
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: nums = [-1,0,2,4,6,8], target = 3
 * Output: -1
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10000.
 * -10000 < nums[i], target < 10000
 * 
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
