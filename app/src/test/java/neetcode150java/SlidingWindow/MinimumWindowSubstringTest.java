package neetcode150java.SlidingWindow;

import org.junit.jupiter.api.Test;

// cspell:ignore OUZODYXAZV, YXAZ, ADOBECODEBANC

public class MinimumWindowSubstringTest {
    @Test
    public void ShouldPassTestCase1() {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String s = "OUZODYXAZV";
        String t = "XYZ";
        String result = minimumWindowSubstring.minWindow(s, t);
        assert (result.equals("YXAZ"));
    }

    @Test
    public void ShouldPassTestCase2() {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String s = "xyz";
        String t = "xyz";
        String result = minimumWindowSubstring.minWindow(s, t);
        assert (result.equals("xyz"));
    }

    @Test
    public void ShouldPassTestCase3() {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String s = "x";
        String t = "xy";
        String result = minimumWindowSubstring.minWindow(s, t);
        assert (result.equals(""));
    }

    @Test
    public void ShouldPassTestCase4() {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minimumWindowSubstring.minWindow(s, t);
        assert (result.equals("BANC"));
    }
}
