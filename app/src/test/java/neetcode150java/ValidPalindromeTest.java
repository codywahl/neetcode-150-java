package neetcode150java;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    @Test
    void ItShouldPassTestCaseOne() {
        // Arrange
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "Was it a car or a cat I saw?";

        // Act
        boolean result = validPalindrome.isPalindrome(s);

        // Assert
        assert (result == true);
    }

    @Test
    void ItShouldPassTestCaseTwo() {
        // Arrange
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "tab a cat";

        // Act
        boolean result = validPalindrome.isPalindrome(s);

        // Assert
        assert (result == false);
    }
}
