package neetcode150java;

import java.util.HashMap;

// cspell:ignore OUZODYXAZV, YXAZ
/**
 * Minimum Window Substring
 * LeetCode 76
 * 
 * Given two strings s and t, return the shortest substring of s such that every
 * character in t, including duplicates, is present in the substring. If such a
 * substring does not exist, return an empty string "".
 * 
 * You may assume that the correct output is always unique.
 * 
 * Example 1:
 * 
 * Input: s = "OUZODYXAZV", t = "XYZ"
 * 
 * Output: "YXAZ"
 * Explanation: "YXAZ" is the shortest substring that includes "X", "Y", and "Z"
 * from string t.
 * 
 * Example 2:
 * 
 * Input: s = "xyz", t = "xyz"
 * 
 * Output: "xyz"
 * Example 3:
 * 
 * Input: s = "x", t = "xy"
 * 
 * Output: ""
 * Constraints:
 * 
 * 1 <= s.length <= 1000
 * 1 <= t.length <= 1000
 * s and t consist of uppercase and lowercase English letters.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || t == null) {
            return "";
        }

        int sLength = s.length();
        int tLength = t.length();

        if (sLength < tLength || sLength == 0 || tLength == 0) {
            return "";
        }

        String result = "";
        int leftPointer = 0;
        int matchedCharactersCount = 0;
        int neededCharactersCount = 0;
        HashMap<Character, Integer> neededCharacters = new HashMap<>();
        HashMap<Character, Integer> windowCharacters = new HashMap<>();

        // Add all characters of t to neededCharacters
        for (char currentCharacter : t.toCharArray()) {
            neededCharacters.put(currentCharacter, neededCharacters.getOrDefault(currentCharacter, 0) + 1);
        }

        neededCharactersCount = neededCharacters.size();

        for (int rightPointer = 0; rightPointer < sLength; rightPointer++) {
            char currentCharacter = s.charAt(rightPointer);

            boolean isCharacterNeeded = neededCharacters.containsKey(currentCharacter);

            // If the character is needed, add it to the windowCharacters
            // and check if the character count is equal to the needed count
            // If it is, increment the matchedCharactersCount
            if (isCharacterNeeded) {
                windowCharacters.put(currentCharacter, windowCharacters.getOrDefault(currentCharacter, 0) + 1);

                int characterCount = windowCharacters.get(currentCharacter);
                int neededCharacterCount = neededCharacters.get(currentCharacter);

                if (characterCount == neededCharacterCount) {
                    matchedCharactersCount++;
                }
            }

            boolean allCharactersMatched = matchedCharactersCount == neededCharactersCount;

            while (allCharactersMatched) {
                // update the minimum window result
                String currentSubString = s.substring(leftPointer, rightPointer + 1);
                if (result.isEmpty() || currentSubString.length() < result.length()) {
                    result = currentSubString;
                }

                // remove the character from the windowCharacters
                char leftCharacter = s.charAt(leftPointer);
                boolean isLeftCharacterNeeded = neededCharacters.containsKey(leftCharacter);

                if (isLeftCharacterNeeded) {
                    int leftCharacterCount = windowCharacters.get(leftCharacter);
                    int updatedLeftCharacterCount = leftCharacterCount - 1;
                    windowCharacters.put(leftCharacter, updatedLeftCharacterCount);

                    int neededCharacterCount = neededCharacters.get(leftCharacter);

                    if (updatedLeftCharacterCount == neededCharacterCount) {
                        matchedCharactersCount++;
                    } else if (updatedLeftCharacterCount < neededCharacterCount) {
                        matchedCharactersCount--;
                    }
                }

                leftPointer++;

                // update allCharactersMatched
                allCharactersMatched = matchedCharactersCount == neededCharactersCount;
            }
        }

        return result;
    }
}
