package neetcode150java.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

// @cspell:ignore strs
/**
 * Encode and Decode Strings
 * Leetcode 271
 * 
 * Design an algorithm to encode a list of strings to a single string. The
 * encoded string is then decoded back to the original list of strings.
 * 
 * Please implement encode and decode
 * 
 * Example 1:
 * 
 * Input: ["neet","code","love","you"]
 * 
 * Output:["neet","code","love","you"]
 * Example 2:
 * 
 * Input: ["we","say",":","yes"]
 * 
 * Output: ["we","say",":","yes"]
 * Constraints:
 * 
 * 0 <= strs.length < 100
 * 0 <= strs[i].length < 200
 * strs[i] contains only UTF-8 characters.
 * 
 */
public class EncodeAndDecodeStrings {
    char delimiter = '~';
    int delimiterLength = 1;

    public String encode(List<String> strs) {
        String encodedString = "";

        for (String currentString : strs) {
            int length = currentString.length();
            encodedString += Integer.toString(length) + delimiter + currentString;
        }

        return encodedString;
    }

    public List<String> decode(String str) {
        if (str.length() == 2) {
            String returnString = "";
            return List.of(returnString);
        }

        List<String> decodedStrings = new ArrayList<>();
        int totalLength = str.length();
        String digits = "";
        boolean delimiterFound = false;

        for (int i = 0; i < totalLength; i++) {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar) && !delimiterFound) {
                digits += currentChar;
            } else if (currentChar == delimiter) {
                delimiterFound = true;

                if (digits.equalsIgnoreCase("0") && i == totalLength - 1) {
                    decodedStrings.add("");
                }
            } else if (delimiterFound) {
                int wordLength = Integer.parseInt(digits);

                int beginningIndex = i;
                int endIndex = beginningIndex + wordLength;

                if (wordLength == 0) {
                    decodedStrings.add("");
                } else {
                    String word = str.substring(beginningIndex, endIndex);

                    decodedStrings.add(word);
                }

                // reset values
                digits = "";
                delimiterFound = false;

                // correct for i++ in for loop
                i = endIndex - 1;
            }
        }

        return decodedStrings;
    }
}
