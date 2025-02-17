package neetcode150java.BinarySearch;

/**
 * Find Minimum in Rotated Sorted Array
 * Leetcode 153
 * 
 * You are given an array of length n which was originally sorted in ascending
 * order. It has now been rotated between 1 and n times. For example, the array
 * nums = [1,2,3,4,5,6] might become:
 * 
 * [3,4,5,6,1,2] if it was rotated 4 times.
 * [1,2,3,4,5,6] if it was rotated 6 times.
 * 1,2,3,4,5,6
 * 6,1,2,3,4,5
 * 5,6,1,2,3,4
 * 4,5,6,1,2,3
 * 3,4,5,6,1,2
 * 2,3,4,5,6,1
 * 1,2,3,4,5,6
 * Notice that rotating the array 4 times moves the last four elements of the
 * array to the beginning. Rotating the array 6 times produces the original
 * array.
 * 
 * Assuming all elements in the rotated sorted array nums are unique, return the
 * minimum element of this array.
 * 
 * A solution that runs in O(n) time is trivial, can you write an algorithm that
 * runs in O(log n) time?
 * 
 * Example 1:
 * 
 * Input: nums = [3,4,5,6,1,2]
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: nums = [4,5,0,1,2,3]
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: nums = [4,5,6,7]
 * Output: 4
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * 
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = nums.length;

        if (length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int midValue = nums[mid];
            int midLeftValue = (mid - 1 >= 0) ? nums[mid - 1] : mid;
            int midRightValue = (mid + 1 < length) ? nums[mid + 1] : mid;
            int rightValue = nums[right];

            if (midValue < midLeftValue && midValue < midRightValue) {
                // mid is the minimum
                return midValue;
            } else if (midValue > midRightValue) {
                // minimum is to the immediate right
                return midRightValue;
            } else if (midValue < rightValue) {
                // minimum is to the left
                right = mid - 1;
            } else {
                // minimum is to the right
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
