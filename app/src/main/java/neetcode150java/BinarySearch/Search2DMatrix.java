package neetcode150java.BinarySearch;

/**
 * Search a 2D Matrix
 * Leetcode 74
 * 
 * You are given an m x n 2-D integer array matrix and an integer target.
 * 
 * Each row in matrix is sorted in non-decreasing order.
 * The first integer of every row is greater than the last integer of the
 * previous row.
 * Return true if target exists within matrix or false otherwise.
 * 
 * Can you write a solution that runs in O(log(m * n)) time?
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
 * Output: true
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15
 * Output: false
 * 
 * Constraints:
 * 
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -10000 <= matrix[i][j], target <= 10000
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        // first determine which row the target is in
        int topRow = 0;
        int bottomRow = rows - 1;
        int rowThatContainsTarget = -1;

        while (topRow <= bottomRow) {
            int midRow = topRow + (bottomRow - topRow) / 2;

            int rowLowestValue = matrix[midRow][0];
            int rowHighestValue = matrix[midRow][columns - 1];

            if (target < rowLowestValue) {
                bottomRow = midRow - 1;
            } else if (target > rowHighestValue) {
                topRow = midRow + 1;
            } else {
                rowThatContainsTarget = midRow;
                break;
            }
        }

        // if the target is not in the matrix
        // then return false
        if (rowThatContainsTarget == -1) {
            return false;
        }

        // now that we know which row the target is in
        // we can perform a binary search on that row

        int left = 0;
        int right = columns - 1;
        int[] row = matrix[rowThatContainsTarget];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
