package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    @Test

    void example1() {
        int[] expected = { 3, 2 };
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        int k = 2;

        var app = new TopKFrequentElements();

        var result = app.topKFrequent(nums, k);

        assertArrayEquals(expected, result);
    }
}
