package neetcode150java.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: nums = [-1,0,2,4,6,8], target = 4
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: nums = [-1,0,2,4,6,8], target = 3
 * Output: -1
 */
public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldPassTestCase1() {
        int[] nums = { -1, 0, 2, 4, 6, 8 };
        int target = 4;
        int expected = 3;
        int actual = binarySearch.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase2() {
        int[] nums = { -1, 0, 2, 4, 6, 8 };
        int target = 3;
        int expected = -1;
        int actual = binarySearch.search(nums, target);

        assertEquals(expected, actual);
    }
}
