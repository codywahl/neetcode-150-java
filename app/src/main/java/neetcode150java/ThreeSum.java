package neetcode150java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 * LeetCode 15
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k
 * are all distinct.
 * 
 * The output should not contain any duplicate triplets. You may return the
 * output and the triplets in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,1,2,-1,-4]
 * -4, -1, -1, 0, 1, 2
 * 
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * 
 * Example 2:
 * 
 * Input: nums = [0,1,1]
 * 
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * 
 * Example 3:
 * 
 * Input: nums = [0,0,0]
 * 
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 * 
 * Constraints:
 * 
 * 3 <= nums.length <= 1000
 * -10^5 <= nums[i] <= 10^5
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;

            while (leftPointer < rightPointer) {
                int sum = nums[i] + nums[leftPointer] + nums[rightPointer];

                if (sum < 0) {
                    leftPointer++;
                } else if (sum > 0) {
                    rightPointer--;
                } else {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]);
                    result.add(triplet);

                    rightPointer--;
                    leftPointer++;

                    // Skip duplicates for leftPointer by moving it to the right until it's
                    // different from the current value
                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer - 1]) {
                        leftPointer++;
                    }
                }
            }
        }

        return result;
    }
}
