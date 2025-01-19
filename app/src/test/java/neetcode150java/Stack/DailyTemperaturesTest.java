package neetcode150java.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: temperatures = [30,38,30,36,35,40,28]
 * Output: [1,4,1,2,1,0,0]
 * 
 * Example 2:
 * 
 * Input: temperatures = [22,21,20]
 * Output: [0,0,0]
 */
public class DailyTemperaturesTest {
    @Test
    public void ShouldPassTestCase1() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = { 30, 38, 30, 36, 35, 40, 28 };
        int[] expectedResult = { 1, 4, 1, 2, 1, 0, 0 };
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);

        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }

    @Test
    public void ShouldPassTestCase2() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = { 22, 21, 20 };
        int[] expectedResult = { 0, 0, 0 };
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);

        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedResult[i], result[i]);
        }
    }
}
