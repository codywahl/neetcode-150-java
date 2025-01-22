package neetcode150java.BinarySearch;
// cspell:ignore Koko

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: piles = [1,4,3,2], h = 9
 * Output: 2
 * Explanation: With an eating rate of 2, you can eat the bananas in 6 hours.
 * With an eating rate of 1, you would need 10 hours to eat all the bananas
 * (which exceeds h=9), thus the minimum eating rate is 2.
 * 
 * Example 2:
 * 
 * Input: piles = [25,10,23,4], h = 4
 * Output: 25
 */
public class KokoEatingBananasTest {
    KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();

    @Test
    public void shouldPassTestCase1() {
        int[] piles = { 1, 4, 3, 2 };
        int h = 9;
        int expected = 2;
        int actual = kokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase2() {
        int[] piles = { 25, 10, 23, 4 };
        int h = 4;
        int expected = 25;
        int actual = kokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expected, actual);
    }
}
