package neetcode150java;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TheeSumTest {
    @Test
    void ItShouldPassTestCaseOne() {
        // Given
        int[] numbers = { -1, 0, 1, 2, -1, -4 };
        ThreeSum threeSum = new ThreeSum();

        // When
        List<List<Integer>> result = threeSum.threeSum(numbers);

        System.out.println(result.toString());

        // Then
        assert result.size() == 2;
        assert result.get(0).get(0) == -1;
        assert result.get(0).get(1) == -1;
        assert result.get(0).get(2) == 2;
        assert result.get(1).get(0) == -1;
        assert result.get(1).get(1) == 0;
        assert result.get(1).get(2) == 1;
    }

    @Test
    void ItShouldPassTestCaseTwo() {
        // Given
        int[] numbers = { 0, 1, 1 };
        ThreeSum threeSum = new ThreeSum();

        // When
        List<List<Integer>> result = threeSum.threeSum(numbers);

        // Then
        assert result.size() == 0;
    }

    @Test
    void ItShouldPassTestCaseThree() {
        // Given
        int[] numbers = { 0, 0, 0 };
        ThreeSum threeSum = new ThreeSum();

        // When
        List<List<Integer>> result = threeSum.threeSum(numbers);

        // Then
        assert result.size() == 1;
        assert result.get(0).get(0) == 0;
        assert result.get(0).get(1) == 0;
        assert result.get(0).get(2) == 0;
    }

    @Test
    void ItShouldPassTestCaseFour() {
        // Given
        int[] numbers = { 0, 0, 0, 0 };
        ThreeSum threeSum = new ThreeSum();

        // When
        List<List<Integer>> result = threeSum.threeSum(numbers);

        // Then
        assert result.size() == 1;
        assert result.get(0).get(0) == 0;
        assert result.get(0).get(1) == 0;
        assert result.get(0).get(2) == 0;
    }
}
