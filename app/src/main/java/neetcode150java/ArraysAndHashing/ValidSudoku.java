package neetcode150java.ArraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Valid Sudoku
 * Leetcode #36
 * 
 * You are given a a 9 x 9 Sudoku board board. A Sudoku board is valid if the
 * following rules are followed:
 * 
 * Each row must contain the digits 1-9 without duplicates.
 * Each column must contain the digits 1-9 without duplicates.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9
 * without duplicates.
 * Return true if the Sudoku board is valid, otherwise return false
 * 
 * Note: A board does not need to be full or be solvable to be valid.
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: board =
 * [["1","2",".",".","3",".",".",".","."],
 * ["4",".",".","5",".",".",".",".","."],
 * [".","9","8",".",".",".",".",".","3"],
 * ["5",".",".",".","6",".",".",".","4"],
 * [".",".",".","8",".","3",".",".","5"],
 * ["7",".",".",".","2",".",".",".","6"],
 * [".",".",".",".",".",".","2",".","."],
 * [".",".",".","4","1","9",".",".","8"],
 * [".",".",".",".","8",".",".","7","9"]]
 * 
 * Output: true
 * Example 2:
 * 
 * Input: board =
 * [["1","2",".",".","3",".",".",".","."],
 * ["4",".",".","5",".",".",".",".","."],
 * [".","9","1",".",".",".",".",".","3"],
 * ["5",".",".",".","6",".",".",".","4"],
 * [".",".",".","8",".","3",".",".","5"],
 * ["7",".",".",".","2",".",".",".","6"],
 * [".",".",".",".",".",".","2",".","."],
 * [".",".",".","4","1","9",".",".","8"],
 * [".",".",".",".","8",".",".","7","9"]]
 * 
 * Output: false
 * Explanation: There are two 1's in the top-left 3x3 sub-box.
 * 
 * Constraints:
 * 
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 * 
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> seenInColumn = new HashMap<>();
        Map<Integer, HashSet<Character>> seenInRow = new HashMap<>();
        Map<String, HashSet<Character>> seenSubBox = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char currentCharacter = board[row][col];

                if (currentCharacter == '.') {
                    continue;
                }

                // Check if the current character is already seen in the row
                if (seenInRow.containsKey(row)) {
                    if (seenInRow.get(row).contains(currentCharacter)) {
                        System.out.println("Duplicate found in row " + row);
                        return false;
                    } else {
                        seenInRow.get(row).add(currentCharacter);
                    }
                } else {
                    HashSet<Character> seen = new HashSet<>();
                    seen.add(currentCharacter);
                    seenInRow.put(row, seen);
                }

                // Check if the current character is already seen in the column
                if (seenInColumn.containsKey(col)) {
                    if (seenInColumn.get(col).contains(currentCharacter)) {
                        System.out.println("Duplicate found in column " + row);
                        return false;
                    } else {
                        seenInColumn.get(col).add(currentCharacter);
                    }
                } else {
                    HashSet<Character> seen = new HashSet<>();
                    seen.add(currentCharacter);
                    seenInColumn.put(col, seen);
                }

                String subBoxKey = (row / 3) + "-" + (col / 3);
                if (seenSubBox.containsKey(subBoxKey)) {
                    if (seenSubBox.get(subBoxKey).contains(currentCharacter)) {
                        System.out.println("Duplicate found in sub-box " + subBoxKey);
                        return false;
                    } else {
                        seenSubBox.get(subBoxKey).add(currentCharacter);
                    }
                } else {
                    HashSet<Character> seen = new HashSet<>();
                    seen.add(currentCharacter);
                    seenSubBox.put(subBoxKey, seen);
                }
            }

        }

        return true;
    }
}
