package neetcode150java;

import java.util.HashSet;

/**
 * Longest Consecutive Sequence
 * LeetCode 128
 * 
 * Given an array of integers nums, return the length of the longest consecutive
 * sequence of elements that can be formed.
 * 
 * A consecutive sequence is a sequence of elements in which each element is
 * exactly 1 greater than the previous element. The elements do not have to be
 * consecutive in the original array.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * Example 1:
 * 
 * Input: nums = [2,20,4,10,3,4,5]
 * 
 * Output: 4
 * Explanation: The longest consecutive sequence is [2, 3, 4, 5].
 * 
 * Example 2:
 * 
 * Input: nums = [0,3,2,5,4,6,1,1]
 * 
 * Output: 7
 * Constraints:
 * 
 * 0 <= nums.length <= 1000
 * -10^9 <= nums[i] <= 10^9
 */

/**
 * Explanation:
 * The idea is to use a hash set to store all the numbers in the array.
 * Then, iterate through the hash set and check if the current number is the
 * start of a sequence.
 * If the current number is the start of a sequence, iterate through the
 * sequence and update the longest streak.
 * Return the longest streak.
 * 
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsHashSet = new HashSet<>();

        // Add all numbers to the hash set
        for (int num : nums) {
            numsHashSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the hash set
        for (int currentNumber : numsHashSet) {
            // Check if the current number is the start of a sequence by checking if
            // nums - 1 is in the hash set
            if (!numsHashSet.contains(currentNumber - 1)) {
                int currentStreak = 1;
                boolean isSequence = true;

                do {
                    int nextNumber = currentNumber + 1;

                    // Check if the next number is in the hash set
                    if (numsHashSet.contains(nextNumber)) {
                        currentStreak++;
                        currentNumber = nextNumber;
                    } else {
                        // If the next number is not in the hash set, the sequence has ended
                        // Update the longest streak and set isSequence to false
                        longestStreak = Math.max(longestStreak, currentStreak);
                        isSequence = false;
                    }

                } while (isSequence);
            }
        }

        return longestStreak;
    }
}
