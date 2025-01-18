package neetcode150java.SlidingWindow;

import org.junit.jupiter.api.Test;

// @cspell:ignore lecaabee, lecabee

public class PermutationInStringTest {
    @Test
    public void ItShouldPassTestCaseOne() {
        PermutationInString permutationInString = new PermutationInString();
        String s1 = "abc";
        String s2 = "lecabee";
        boolean result = permutationInString.checkInclusion(s1, s2);
        assert result == true;
    }

    @Test
    public void ItShouldPassTestCaseTwo() {
        PermutationInString permutationInString = new PermutationInString();
        String s1 = "abc";
        String s2 = "lecaabee";
        boolean result = permutationInString.checkInclusion(s1, s2);
        assert result == false;
    }
}
