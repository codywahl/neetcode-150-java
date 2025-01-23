package neetcode150java.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: nums = [3,4,5,6,1,2]
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: nums = [4,5,0,1,2,3]
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: nums = [4,5,6,7]
 * Output: 4
 */
public class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void shouldPassTestCase1() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int expected = 1;
        int actual = findMinimumInRotatedSortedArray.findMin(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase2() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] nums = { 4, 5, 0, 1, 2, 3 };
        int expected = 0;
        int actual = findMinimumInRotatedSortedArray.findMin(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase3() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] nums = { 4, 5, 6, 7 };
        int expected = 4;
        int actual = findMinimumInRotatedSortedArray.findMin(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase4() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] nums = { 1, 2, };
        int expected = 1;
        int actual = findMinimumInRotatedSortedArray.findMin(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase5() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] nums = { 5,1,2,3,4 };
        int expected = 1;
        int actual = findMinimumInRotatedSortedArray.findMin(nums);

        assertEquals(expected, actual);
    }
}
