package neetcode150java.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: heights = [7,1,7,2,2,4]
 * Output: 8
 * 
 * Example 2:
 * 
 * Input: heights = [1,3,7]
 * Output: 7
 */
public class LargestRectangleInHistogramTest {
    LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

    @Test
    public void shouldPassTestCase1() {
        int[] input = { 7, 1, 7, 2, 2, 4 };
        int expected = 8;
        int actual = largestRectangleInHistogram.largestRectangleArea(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase2() {
        int[] input = { 1, 3, 7 };
        int expected = 7;
        int actual = largestRectangleInHistogram.largestRectangleArea(input);

        assertEquals(expected, actual);
    }
}
