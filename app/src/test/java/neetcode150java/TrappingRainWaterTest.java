package neetcode150java;

import org.junit.jupiter.api.Test;

import neetcode150java.TwoPointers.TrappingRainWater;

public class TrappingRainWaterTest {
    @Test
    public void shouldPassTestCase1() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };
        int result = trappingRainWater.trap(height);
        assert result == 9;
    }
}
