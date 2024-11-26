package neetcode150java;

import java.util.HashMap;

// cspell:ignore racecar, carrace
/**
 * Valid Anagram
 * Leetcode 242
 * 
 * Given two strings s and t, return true if the two strings are anagrams of
 * each other, otherwise return false.
 * 
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 * 
 * Example 1:
 * 
 * Input: s = "racecar", t = "carrace"
 * 
 * Output: true
 * Example 2:
 * 
 * Input: s = "jar", t = "jam"
 * 
 * Output: false
 * Constraints:
 * 
 * s and t consist of lowercase English letters.
 */

/**
 * Explanation:
 * First, check if the lengths of the two strings are equal.
 * If they are not, return false.
 * 
 * If they are...
 * Use a HashMap setting a letter as the key and the count of the letter as the
 * value.
 * 
 * Loop over the strings, as they have the same length, getting the character at
 * position i.
 * Use the character as the key, and...
 * From string s increment the count
 * From string t decrement the count
 * 
 * Then, loop over the values in the HashMap.
 * If any value is not 0, return false.
 * 
 * Time complexity: O(n)
 * .length() is O(1) time complexity
 * The loop over the string is O(n) time complexity
 * The loop over the values in the HashMap is O(n) time complexity
 * 
 * So, it's really O(2n) but we drop the constant and it's O(n)
 * 
 * Space complexity: O(n)
 * We build a hashmap with n many keys and values, meaning O(n) space complexity
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength) {
            return false;
        }

        var letterCount = new HashMap<Character, Integer>();

        for (int i = 0; i < sLength; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!letterCount.containsKey(sChar)) {
                letterCount.put(sChar, 1);
            } else {
                letterCount.put(sChar, letterCount.get(sChar) + 1);
            }

            if (!letterCount.containsKey(tChar)) {
                letterCount.put(tChar, -1);
            } else {
                letterCount.put(tChar, letterCount.get(tChar) - 1);
            }

        }

        for (int count : letterCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
