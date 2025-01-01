package neetcode150java;

import java.util.HashSet;

// @cspell:ignore zxyzxyz
/**
 * Longest Substring Without Repeating Characters
 * Leetcode #3
 * 
 * Given a string s, find the length of the longest substring without duplicate
 * characters.
 * 
 * A substring is a contiguous sequence of characters within a string.
 * 
 * Example 1:
 * 
 * Input: s = "zxyzxyz"
 * 
 * Output: 3
 * Explanation: The string "xyz" is the longest without duplicate characters.
 * 
 * Example 2:
 * 
 * Input: s = "xxxx"
 * 
 * Output: 1
 * Constraints:
 * 
 * 0 <= s.length <= 1000
 * s may consist of printable ASCII characters.
 */
/**
 * Explanation:
 * 
 * We will use a sliding window approach to solve this problem. We will keep
 * track of the characters in the current window using a HashSet. We will
 * maintain two pointers, leftIndex and rightIndex, to keep track of the current
 * window. We will iterate through the string from left to right. If the
 * character at the rightIndex is not in the HashSet, we will add it to the
 * HashSet and increment the rightIndex. If the character at the rightIndex is
 * already in the HashSet, we will remove the character at the leftIndex from
 * the HashSet and increment the leftIndex. We will keep track of the maximum
 * substring length seen so far and return it as the result.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> currentWindowCharacters = new HashSet<>();
        int leftIndex = 0, maxSubstringLength = 0;

        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            char currentChar = s.charAt(rightIndex);

            while (currentWindowCharacters.contains(currentChar)) {
                currentWindowCharacters.remove(s.charAt(leftIndex));
                leftIndex++;
            }

            currentWindowCharacters.add(currentChar);

            int currentSubstringLength = rightIndex - leftIndex + 1;

            if (currentSubstringLength > maxSubstringLength) {
                maxSubstringLength = currentSubstringLength;
            }
        }

        return maxSubstringLength;
    }
}
