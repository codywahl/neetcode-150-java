package neetcode150java.SlidingWindow;

import org.junit.jupiter.api.Test;

public class SlidingWindowMaximumTest {
    @Test
    public void ShouldPassTestCase1() {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] nums = { 1, 2, 1, 0, 4, 2, 6 };
        int k = 3;
        int[] result = slidingWindowMaximum.maxSlidingWindow(nums, k);
        int[] expected = { 2, 2, 4, 4, 6 };

        assert (result.length == expected.length);

        for (int i = 0; i < result.length; i++) {
            assert (result[i] == expected[i]);
        }
    }
}
