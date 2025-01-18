package neetcode150java;

import org.junit.jupiter.api.Test;

import neetcode150java.ArraysAndHashing.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelfTest {
    @Test
    void testCase1() {
        // Input:
        var input = new int[] { 1, 2, 4, 6 };
        var expectedOutput = new int[] { 48, 24, 12, 8 };

        // Act
        var app = new ProductOfArrayExceptSelf();
        var result = app.productExceptSelf(input);

        // Assert
        assert (result.length == expectedOutput.length);
        for (int i = 0; i < result.length; i++) {
            assert (result[i] == expectedOutput[i]);
        }
    }
}
