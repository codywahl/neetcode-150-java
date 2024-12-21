package neetcode150java;

import org.junit.jupiter.api.Test;

public class TwoSumTwoTest {
    @Test
    void ItShouldPassTestCaseOne() {
        // Given
        int[] numbers = { 1, 2, 3, 4 };
        int target = 3;
        var app = new TwoSumTwo();

        // When
        int[] result = app.twoSum(numbers, target);

        // Then
        assert result[0] == 1;
        assert result[1] == 2;
    }

    @Test
    void ItShouldPassTestCaseTwo() {
        // Given
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        TwoSumTwo twoIntegerSumTwo = new TwoSumTwo();

        // When
        int[] result = twoIntegerSumTwo.twoSum(numbers, target);

        // Then
        assert result[0] == 1;
        assert result[1] == 2;
    }
}
