package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import neetcode150java.ArraysAndHashing.ContainsDuplicate;

public class ContainsDuplicateTest {

    @Test
    void ifProvidedNumbersWithoutDuplicatesItReturnsFalse() {
        int[] nums = { 1, 2, 3, 4 };
        ContainsDuplicate app = new ContainsDuplicate();

        assertFalse(app.hasDuplicate(nums));
    }

    @Test
    void ifProvidedNumberWithDuplicatesItReturnsTrue() {
        int[] nums = { 1, 2, 3, 3 };
        ContainsDuplicate app = new ContainsDuplicate();

        assertTrue(app.hasDuplicate(nums));
    }
}