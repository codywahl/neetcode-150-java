package neetcode150java.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {
    @Test
    public void ShouldPassTestCase1() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        String[] tokens = { "1", "2", "+", "3", "*", "4", "-" };
        int expectedResult = 5;
        int result = evaluateReversePolishNotation.evalRPN(tokens);

        assertEquals(expectedResult, result);
    }
}
