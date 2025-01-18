package neetcode150java.SlidingWindow;

import java.util.Arrays;

// @cspell:ignore lecaabee, lecabee
/**
 * Permutation in String
 * Leetcode #567
 * 
 * You are given two strings s1 and s2.
 * 
 * Return true if s2 contains a permutation of s1, or false otherwise. That
 * means if a permutation of s1 exists as a substring of s2, then return true.
 * 
 * Both strings only contain lowercase letters.
 * 
 * Example 1:
 * 
 * Input: s1 = "abc", s2 = "lecabee"
 * 
 * Output: true
 * Explanation: The substring "cab" is a permutation of "abc" and is present in
 * "lecabee".
 * 
 * Example 2:
 * 
 * Input: s1 = "abc", s2 = "lecaabee"
 * 
 * Output: false
 * Constraints:
 * 
 * 1 <= s1.length, s2.length <= 1000
 */

/**
 * Explanation:
 * 
 * The idea is to sort the string s1 and then compare it with all the substrings
 * of s2 of length s1.length(). If any of the substrings is equal to the sorted
 * s1, then return true.
 * 
 * This is a brute force option and not the most efficient one. But,
 * the readability and simplicity of the code is good. It took minutes to write
 * and
 * honestly, would be easier to maintain than the optimized version.
 * 
 * In cases where performance is a concern, the optimized version should be
 * used,
 * which makes use of a sliding window.
 * 
 * Time complexity: O(n log n)
 * Space complexity: O(n)
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        String s1Sorted = sortString(s1);
        int s1Length = s1.length();

        for (int i = 0; i <= s2.length() - s1Length; i++) {
            String subString = s2.substring(i, i + s1Length);
            if (sortString(subString).equals(s1Sorted)) {
                return true;
            }
        }

        return false;
    }

    public String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
