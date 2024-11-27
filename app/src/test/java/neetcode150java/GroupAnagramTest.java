package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GroupAnagramTest {
    @Test
    void example1ShouldReturnTheExpectedValues() {
        var input = new String[] { "act", "pots", "tops", "cat", "stop", "hat" };
        var app = new GroupAnagram();
        var result = app.groupAnagrams(input);

        assertEquals("[[act, cat], [pots, tops, stop], [hat]]", result.toString());
    }

    @Test
    void submissionTestShouldReturnTheExpectedValues() {
        var input = new String[] { "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc" };
        var app = new GroupAnagram();
        var result = app.groupAnagrams(input);

        assertEquals("[[duh], [max], [tin], [cab], [bar], [buy], [pew], [may], [doc], [ill]]", result.toString());
    }
}
