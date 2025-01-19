package neetcode150java.Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 * LeetCode 22
 * 
 * You are given an integer n. Return all well-formed parentheses strings that
 * you can generate with n pairs of parentheses.
 * 
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
 * You may return the answer in any order.
 * 
 * Constraints:
 * 
 * 1 <= n <= 7
 */
public class GenerateParentheses {
    List<String> result;

    public List<String> generateParenthesis(int n) {
        if (n < 1 || n > 7) {
            return null;
        }

        this.result = new ArrayList<>();
        GenerateParenthesisCombinations("", n, 0, 0);
        return result;
    }

    public void GenerateParenthesisCombinations(String s, int parenthesesCount, int openParentheses,
            int closeParentheses) {
        // A valid solution has: OpenParenthesis and CloseParenthesis count must be
        // equal AND when added together must be 2x the pair count.
        if (openParentheses == closeParentheses && (openParentheses + closeParentheses) == 2 * parenthesesCount) {
            result.add(s);
            return;
        }

        // Open or Close parenthesis' can't outnumber the total count.
        // If there are more close braces than open, the parenthesis are unbalanced.
        if (closeParentheses <= parenthesesCount && openParentheses <= parenthesesCount
                && openParentheses >= closeParentheses) {
            // Adds open parenthesis
            GenerateParenthesisCombinations(s + "(", parenthesesCount, openParentheses + 1, closeParentheses);
            // Adds close parenthesis
            GenerateParenthesisCombinations(s + ")", parenthesesCount, openParentheses, closeParentheses + 1);
        }
    }
}
