package neetcode150java.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: nums = [3,4,5,6,1,2], target = 1
 * Output: 4
 * 
 * Example 2:
 * 
 * Input: nums = [3,5,6,0,1,2], target = 4
 * Output: -1
 */
public class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    public void shouldPassTestCase1() {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int target = 1;
        int expected = 4;
        int actual = searchInRotatedSortedArray.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase2() {
        int[] nums = { 3, 5, 6, 0, 1, 2 };
        int target = 4;
        int expected = -1;
        int actual = searchInRotatedSortedArray.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase3() {
        int[] nums = { 4, 5, 6, 7 };
        int target = 4;
        int expected = 0;
        int actual = searchInRotatedSortedArray.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase4() {
        int[] nums = { 5, 1, 2, 3, 4 };
        int target = 1;
        int expected = 1;
        int actual = searchInRotatedSortedArray.search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase5() {
        int[] nums = { 5, 1, 2, 3, 4 };
        int target = 5;
        int expected = 0;
        int actual = searchInRotatedSortedArray.search(nums, target);

        assertEquals(expected, actual);
    }

}
