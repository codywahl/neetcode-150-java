package neetcode150java.Stack;

import java.util.Stack;

/**
 * Evaluate Reverse Polish Notation
 * LeetCode #150
 * 
 * You are given an array of strings tokens that represents a valid arithmetic
 * expression in Reverse Polish Notation.
 * 
 * Return the integer that represents the evaluation of the expression.
 * 
 * The operands may be integers or the results of other operations.
 * The operators include '+', '-', '*', and '/'.
 * Assume that division between integers always truncates toward zero.
 * Example 1:
 * 
 * Input: tokens = ["1","2","+","3","*","4","-"]
 * 
 * Output: 5
 * 
 * Explanation: ((1 + 2) * 3) - 4 = 5
 * Constraints:
 * 
 * 1 <= tokens.length <= 1000.
 * tokens[i] is "+", "-", "*", or "/", or a string representing an integer in
 * the range [-100, 100].
 */
/**
 * Explanation:
 * 
 * Reverse Polish Notation (RPN) is a mathematical notation in which every
 * operator follows all of its operands. For example, the infix expression
 * (1 + 2) * 3 can be written as 1 2 + 3 * in RPN.
 * 
 * To evaluate an RPN expression, we can use a stack to store the operands.
 * 
 * We loop over the tokens in the array.
 * If the token is an operator, we pop the top two elements from the stack and
 * perform the operation.
 * 
 * If the token is an operand, we push it onto the stack.
 * 
 * Finally, we return the top element of the stack, which is the result of the
 * expression.
 * 
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens.length < 1 || tokens.length > 1000) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                stack.push(operand1 / operand2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
