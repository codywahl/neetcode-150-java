package neetcode150java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Top K Frequent Elements
 * Leetcode 347
 * 
 * Given an integer array nums and an integer k, return the k most frequent
 * elements within the array.
 * 
 * The test cases are generated such that the answer is always unique.
 * 
 * You may return the output in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,2,3,3,3], k = 2
 * 
 * Output: [2,3]
 * Example 2:
 * 
 * Input: nums = [7,7], k = 1
 * 
 * Output: [7]
 * Constraints:
 * 
 * 1 <= nums.length <= 10^4.
 * -1000 <= nums[i] <= 1000
 * 1 <= k <= number of distinct elements in nums.
 */

/**
 * Explanation:
 *
 * The idea is to count the frequency of each number in the array and then
 * create a bucket where the index is the frequency and the value is a list of
 * numbers that have that frequency.
 * 
 * Then, iterate over the bucket from the end to the beginning and add the
 * numbers to the result array until the result array has k elements.
 * 
 * The time complexity is O(n) where n is the length of the input array.
 * 
 * The space complexity is O(n) where n is the length of the input array.
 * 
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;

        if (length < 1) {
            return new int[0];
        }

        // Key: number, Value: frequency
        HashMap<Integer, Integer> numberFrequencies = new HashMap<>();
        for (int i = 0; i < length; i++) {
            var currentNumber = nums[i];
            numberFrequencies.put(currentNumber, numberFrequencies.getOrDefault(currentNumber, 0) + 1);
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new ArrayList[length + 1];

        numberFrequencies.forEach((number, frequency) -> {
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(number);
        });

        int[] resultArray = new int[k];
        int added = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] == null) {
                continue;
            }

            for (int number : buckets[i]) {
                resultArray[added] = number;
                added++;

                if (added == k) {
                    return resultArray;
                }
            }
        }

        return resultArray;
    }
}
