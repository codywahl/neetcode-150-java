package neetcode150java.Stack;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: s = "[]"
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "([{}])"
 * Output: true
 * 
 * Example 3:
 * 
 * Input: s = "[(])"
 * Output: false
 */
public class ValidParenthesesTest {
    @Test
    public void ShouldPassTestCase1() {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "[]";
        boolean result = validParentheses.isValid(s);

        assert (result == true);
    }

    @Test
    public void ShouldPassTestCase2() {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "([{}])";
        boolean result = validParentheses.isValid(s);

        assert (result == true);
    }

    @Test
    public void ShouldPassTestCase3() {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "[(])";
        boolean result = validParentheses.isValid(s);

        assert (result == false);
    }
}
