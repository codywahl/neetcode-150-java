package neetcode150java.TwoPointers;

// @cspell:ignore wasitacaroracatisaw, tabacat
/**
 * Valid Palindrome
 * Leetcode 125
 * Given a string s, return true if it is a palindrome, otherwise return false.
 * 
 * A palindrome is a string that reads the same forward and backward. It is also
 * case-insensitive and ignores all non-alphanumeric characters.
 * 
 * Example 1:
 * 
 * Input: s = "Was it a car or a cat I saw?"
 * 
 * Output: true
 * Explanation: After considering only alphanumerical characters we have
 * "wasitacaroracatisaw", which is a palindrome.
 * 
 * Example 2:
 * 
 * Input: s = "tab a cat"
 * 
 * Output: false
 * Explanation: "tabacat" is not a palindrome.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 1000
 * s is made up of only printable ASCII characters.
 * 
 */
/**
 * Explanation:
 * 
 * First, check if the string is empty. If it is, return true.
 * 
 * Next, convert the string to lowercase and remove all non-alphanumeric
 * characters.
 * 
 * Then, initialize two pointers, leftCount and rightCount, to 0 and s.length()
 * - 1, respectively.
 * 
 * While leftCount is less than rightCount, compare the characters at the
 * leftCount and rightCount indices.
 * If they are not equal, return false.
 * 
 * If the loop completes, return true.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int leftCount = 0;
        int rightCount = s.length() - 1;

        while (leftCount < rightCount) {
            if (s.charAt(leftCount) != s.charAt(rightCount)) {
                return false;
            }

            leftCount++;
            rightCount--;
        }

        return true;
    }
}
