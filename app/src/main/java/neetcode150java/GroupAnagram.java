package neetcode150java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// cspell:ignore strs, sublists
/**
 * Group Anagrams
 * Leetcode 49
 * 
 * Given an array of strings strs, group all anagrams together into sublists.
 * You may return the output in any order.
 * 
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 * 
 * Example 1:
 * 
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * 
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 * Example 2:
 * 
 * Input: strs = ["x"]
 * 
 * Output: [["x"]]
 * Example 3:
 * 
 * Input: strs = [""]
 * 
 * Output: [[""]]
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 1000.
 * 0 <= strs[i].length <= 100
 * strs[i] is made up of lowercase English letters.
 */

/**
 * Explanation:
 * First we loop over every string.
 * 
 * For each string, we convert it to a char array.
 * Then we create an array of 26 integers to store the count of each character.
 * 
 * We loop over the characters in the string and increment the count of each
 * character in the count array.
 * 
 * Then we convert the count array to a string using Arrays.toString() which
 * will give us a unique key for each anagram.
 * 
 * 
 * Time Complexity: O(n * k) where n is the number of strings and k is the
 * length of the longest string.
 * 
 * Space Complexity: O(n)
 * Because worst case scenario we will store all the strings in the map.
 */
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            var chars = s.toCharArray();
            var count = new int[26];

            for (char c : chars) {
                count[c - 'a']++;
            }

            // have to use Arrays.toString not .toString() in Java
            // or you'll get a memory location
            String key = Arrays.toString(count);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
