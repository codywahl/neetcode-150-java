package neetcode150java.BinarySearch;

/**
 * Search in Rotated Sorted Array
 * LeetCode 33
 * 
 * You are given an array of length n which was originally sorted in ascending
 * order. It has now been rotated between 1 and n times. For example, the array
 * nums = [1,2,3,4,5,6] might become:
 * 
 * [3,4,5,6,1,2] if it was rotated 4 times.
 * [1,2,3,4,5,6] if it was rotated 6 times.
 * Given the rotated sorted array nums and an integer target, return the index
 * of target within nums, or -1 if it is not present.
 * 
 * You may assume all elements in the sorted rotated array nums are unique,
 * 
 * A solution that runs in O(n) time is trivial, can you write an algorithm that
 * runs in O(log n) time?
 * 
 * Example 1:
 * 
 * Input: nums = [3,4,5,6,1,2], target = 1
 * Output: 4
 * 
 * Example 2:
 * 
 * Input: nums = [3,5,6,0,1,2], target = 4
 * Output: -1
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -1000 <= target <= 1000
 * 
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        int length = nums.length;

        if (length == 0) {
            return -1;
        }
        if (length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int leftIndex = 0;
        int rightIndex = length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            int midValue = nums[midIndex];

            if (midValue == target) {
                return midIndex;
            }

            int leftValue = nums[leftIndex];
            int rightValue = nums[rightIndex];

            if (target < midValue) {
                // if target is less than the left value and the mid value
                // it means target is in the right half
                if (target < leftValue) {
                    leftIndex = midIndex + 1;
                } else {
                    rightIndex = midIndex - 1;
                }
            } else {
                // if target is greater than the right value and the mid value
                // it means target is in the left half
                if (target > rightValue) {
                    rightIndex = midIndex - 1;
                } else {
                    leftIndex = midIndex + 1;
                }
            }

        }

        return -1;
    }
}
