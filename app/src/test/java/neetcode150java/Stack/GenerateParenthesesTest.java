package neetcode150java.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: n = 1
 * 
 * Output: ["()"]
 * Example 2:
 * 
 * Input: n = 3
 * 
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 */
public class GenerateParenthesesTest {
    @Test
    public void ShouldPassTestCase1() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 1;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("()");

        List<String> result = generateParentheses.generateParenthesis(n);

        for (String resultString : result) {
            assertTrue(expectedResult.contains(resultString));
        }

        assertEquals(expectedResult.size(), result.size());
    }

    @Test
    public void ShouldPassTestCase2() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 3;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("((()))");
        expectedResult.add("(()())");
        expectedResult.add("(())()");
        expectedResult.add("()(())");
        expectedResult.add("()()()");

        List<String> result = generateParentheses.generateParenthesis(n);

        for (String resultString : result) {
            assertTrue(expectedResult.contains(resultString));
        }

        assertEquals(expectedResult.size(), result.size());
    }
}
