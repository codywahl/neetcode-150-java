package neetcode150java;

import org.junit.jupiter.api.Test;

// cspell:ignore OUZODYXAZV, YXAZ
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
}
