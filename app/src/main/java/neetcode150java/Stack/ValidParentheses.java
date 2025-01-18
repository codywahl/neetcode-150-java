package neetcode150java.Stack;

import java.util.Stack;

/**
 * Valid Parentheses
 * LeetCode 20
 * 
 * You are given a string s consisting of the following characters: '(', ')',
 * '{', '}', '[' and ']'.
 * 
 * The input string s is valid if and only if:
 * 
 * Every open bracket is closed by the same type of close bracket.
 * Open brackets are closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Return true if s is a valid string, and false otherwise.
 * 
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
 * Explanation: The brackets are not closed in the correct order.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 1000
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        // If the length of the string is odd, it cannot be a valid string
        //int leetcodeMaxLength = 10000;
        int neetcodeMaxLength = 1000;

        if (s.length() % 2 != 0 || s.length() > neetcodeMaxLength) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char currentCharacter : s.toCharArray()) {
            if (currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '[') {
                stack.push(currentCharacter);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char poppedCharacter = stack.pop();
                if (currentCharacter == ')' && poppedCharacter != '(') {
                    return false;
                }
                if (currentCharacter == '}' && poppedCharacter != '{') {
                    return false;
                }
                if (currentCharacter == ']' && poppedCharacter != '[') {
                    return false;
                }
            }
        }

        return true;
    }
}
