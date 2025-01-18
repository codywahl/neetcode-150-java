package neetcode150java.SlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// @cspell:ignore AAABABB, ABBB, XYYX

public class LongestRepeatingCharacterReplacementTest {
    @Test
    public void shouldPassTestCase1() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        int result = longestRepeatingCharacterReplacement.characterReplacement("XYYX", 2);

        assertEquals(4, result);
    }

    @Test
    public void shouldPassTestCase2() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        int result = longestRepeatingCharacterReplacement.characterReplacement("AAABABB", 1);

        assertEquals(5, result);
    }

    @Test
    public void shouldPassTestCase3() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        int result = longestRepeatingCharacterReplacement.characterReplacement("ABBB", 2);

        assertEquals(4, result);
    }

    @Test
    public void shouldPassTestCase4() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        int result = longestRepeatingCharacterReplacement.characterReplacement("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 25);

        assertEquals(26, result);
    }
}
