package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import neetcode150java.ArraysAndHashing.TwoSum;

public class TwoSumTest {
    // Example 1:
    // Input: nums = [3,4,5,6], target = 7
    // Output: [0,1]
    @Test
    void example1ShouldReturn0And1() {
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;
        int[] expected = { 0, 1 };
        TwoSum app = new TwoSum();

        int[] result = app.twoSum(nums, target);

        assertTrue(result[0] == expected[0] && result[1] == expected[1]);
    }

    // Example 2:
    // Input: nums = [4,5,6], target = 10
    // Output: [0,2]
    @Test
    void example2ShouldReturn0And2() {
        int[] nums = { 4, 5, 6 };
        int target = 10;
        int[] expected = { 0, 2 };
        TwoSum app = new TwoSum();

        int[] result = app.twoSum(nums, target);

        assertTrue(result[0] == expected[0] && result[1] == expected[1]);
    }

    // Example 3:
    // Input: nums = [5,5], target = 10
    // Output: [0,1]
    @Test
    void example3ShouldReturn0And1() {
        int[] nums = { 5, 5 };
        int target = 10;
        int[] expected = { 0, 1 };
        TwoSum app = new TwoSum();

        int[] result = app.twoSum(nums, target);

        assertTrue(result[0] == expected[0] && result[1] == expected[1]);
    }
}
