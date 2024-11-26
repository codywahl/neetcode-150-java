package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// cspell:ignore racecar, carrace

public class ValidAnagramTest {
    @Test
    void ifProvidedAnagramsItReturnsTrue() {
        String s = "racecar";
        String t = "carrace";
        ValidAnagram app = new ValidAnagram();

        assertTrue(app.isAnagram(s, t));
    }

    @Test
    void ifProvidedNonAnagramsItReturnsFalse() {
        String s = "jar";
        String t = "jam";
        ValidAnagram app = new ValidAnagram();

        assertFalse(app.isAnagram(s, t));
    }
}
