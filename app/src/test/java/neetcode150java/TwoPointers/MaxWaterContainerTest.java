package neetcode150java.TwoPointers;

import org.junit.jupiter.api.Test;

public class MaxWaterContainerTest {
    @Test
    public void shouldPassTestCase1() {
        MaxWaterContainer maxWaterContainer = new MaxWaterContainer();
        int[] input = { 1, 7, 2, 5, 4, 7, 3, 6 };
        int expected = 36;
        int result = maxWaterContainer.maxArea(input);

        assert result == expected;
    }

    @Test
    public void shouldPassTestCase2() {
        MaxWaterContainer maxWaterContainer = new MaxWaterContainer();
        int[] input = { 2, 2, 2 };
        int expected = 4;
        int result = maxWaterContainer.maxArea(input);

        assert result == expected;
    }
}
