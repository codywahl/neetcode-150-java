package neetcode150java;

import org.junit.jupiter.api.Test;

import neetcode150java.ArraysAndHashing.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceTest {
    @Test
    void ShouldPassTestCaseOne() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assert (result == 4);
    }

    @Test
    void ShouldPassTestCaseTwo() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = { 0, 3, 2, 5, 4, 6, 1, 1 };
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assert (result == 7);
    }
}
