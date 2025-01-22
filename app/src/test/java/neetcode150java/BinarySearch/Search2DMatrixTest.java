package neetcode150java.BinarySearch;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
 * Output: true
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15
 * Output: false
 */
public class Search2DMatrixTest {
    Search2DMatrix search2DMatrix = new Search2DMatrix();

    @Test
    public void shouldPassTestCase1() {
        int[][] matrix = { { 1, 2, 4, 8 }, { 10, 11, 12, 13 }, { 14, 20, 30, 40 } };
        int target = 10;
        boolean expected = true;
        boolean actual = search2DMatrix.searchMatrix(matrix, target);

        assert (expected == actual);
    }

    @Test
    public void shouldPassTestCase2() {
        int[][] matrix = { { 1, 2, 4, 8 }, { 10, 11, 12, 13 }, { 14, 20, 30, 40 } };
        int target = 15;
        boolean expected = false;
        boolean actual = search2DMatrix.searchMatrix(matrix, target);

        assert (expected == actual);
    }
}
