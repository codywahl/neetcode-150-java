package neetcode150java.ArraysAndHashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidSudokuTest {
    @Test
    void itShouldPassTestCaseOneReturningTrue() {
        char[][] board = {
                { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
                { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
                { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
                { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        ValidSudoku app = new ValidSudoku();

        assertEquals(app.isValidSudoku(board), true);

    }

    @Test
    void itShouldPassTestCaseTwoReturningFalse() {
        char[][] board = {
                { '.', '.', '4', '.', '.', '.', '6', '3', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '5', '.', '.', '.', '.', '.', '.', '9', '.' },
                { '.', '.', '.', '5', '6', '.', '.', '.', '.' },
                { '4', '.', '3', '.', '.', '.', '.', '.', '1' },
                { '.', '.', '.', '7', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }
        };

        ValidSudoku app = new ValidSudoku();

        assertEquals(app.isValidSudoku(board), false);
    }
}
