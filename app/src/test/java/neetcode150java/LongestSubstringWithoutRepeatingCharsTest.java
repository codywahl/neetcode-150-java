package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import neetcode150java.SlidingWindow.LongestSubstringWithoutRepeatingChars;

public class LongestSubstringWithoutRepeatingCharsTest {
    @Test
    public void shouldPassTestCase1() {
        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        int result = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("zxyzxyz");

        assertEquals(result, 3);
    }

    @Test
    public void shouldPassTestCase2() {
        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        int result = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("xxxx");

        assertEquals(result, 1);
    }

    @Test
    public void shouldPassTestCase3() {
        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        int result = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("abcabcbb");

        assert result == 3;
    }

    @Test
    public void shouldPassTestCase4() {
        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        int result = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("au");

        assertEquals(result, 2);
    }
}
