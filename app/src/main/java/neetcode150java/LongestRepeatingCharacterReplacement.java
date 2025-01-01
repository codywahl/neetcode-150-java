package neetcode150java;

import java.util.HashMap;

// @cspell:ignore AAABABB, XYYX
/**
 * Longest Repeating Character Replacement
 * LeetCode 424
 * 
 * You are given a string s consisting of only uppercase english characters and
 * an integer k. You can choose up to k characters of the string and replace
 * them with any other uppercase English character.
 * 
 * After performing at most k replacements, return the length of the longest
 * substring which contains only one distinct character.
 * 
 * Example 1:
 * 
 * Input: s = "XYYX", k = 2
 * 
 * Output: 4
 * Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with
 * 'X's.
 * 
 * Example 2:
 * 
 * Input: s = "AAABABB", k = 1
 * 
 * Output: 5
 * Constraints:
 * 
 * 1 <= s.length <= 1000
 * 0 <= k <= s.length
 */

/**
 * Explanation:
 * 
 * We will use a sliding window approach to solve this problem. We will maintain
 * a HashMap to keep track of the count of characters in the current window. We
 * will maintain two pointers, leftIndex and rightIndex, to keep track of the
 * current window. We will iterate through the string from left to right. We
 * will
 * keep track of the most frequent character count in the current window. If the
 * number of replacements needed to make the current window valid is greater
 * than
 * k, we will increment the leftIndex and update the character count. If the
 * number of replacements needed is less than or equal to k, we will update the
 * maxSubstringLength if the current window length is greater than the
 * maxSubstringLength.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int inputLength = s.length();

        if (k >= inputLength || inputLength == 1) {
            return inputLength;
        }

        HashMap<Character, Integer> characterCount = new HashMap<>();
        int leftIndex = 0, mostFrequentCharacterCount = 0, maxSubstringLength = 0;

        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            char rightIndexCharacter = s.charAt(rightIndex);
            int rightIndexCharacterCount = characterCount.getOrDefault(rightIndexCharacter, 0) + 1;

            characterCount.put(rightIndexCharacter, rightIndexCharacterCount);

            // Update the most frequent character count
            if (rightIndexCharacterCount > mostFrequentCharacterCount) {
                mostFrequentCharacterCount = rightIndexCharacterCount;
            }

            int windowSize = rightIndex - leftIndex + 1;
            int replacementsNeeded = windowSize - mostFrequentCharacterCount;

            if (replacementsNeeded > k) {
                char leftCharacter = s.charAt(leftIndex);
                characterCount.put(leftCharacter, characterCount.get(leftCharacter) - 1);
                leftIndex++;
            } else {
                if (windowSize > maxSubstringLength) {
                    maxSubstringLength = windowSize;
                }
            }

        }

        return maxSubstringLength;
    }
}
