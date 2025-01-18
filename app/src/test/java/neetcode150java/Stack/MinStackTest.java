package neetcode150java.Stack;

import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test
    public void ShouldPassTestCase1() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        int min = minStack.getMin(); // return 0
        assert (min == 0);

        minStack.pop();
        int top = minStack.top(); // return 2
        assert (top == 2);

        min = minStack.getMin(); // return 1
        assert (min == 1);
    }
}
