package neetcode150java.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input:
 * ["TimeMap", "set", ["alice", "happy", 1], "get", ["alice", 1], "get",
 * ["alice", 2], "set", ["alice", "sad", 3], "get", ["alice", 3]]
 * 
 * Output:
 * [null, null, "happy", "happy", null, "sad"]
 */
public class TimeMapTest {
    TimeMap timeMap = new TimeMap();

    @Test
    public void shouldPassTestCase1() {
        timeMap.set("alice", "happy", 1);
        String expected = "happy";
        String actual = timeMap.get("alice", 1);

        assertEquals(expected, actual);

        expected = "happy";
        actual = timeMap.get("alice", 2);

        assertEquals(expected, actual);

        timeMap.set("alice", "sad", 3);
        expected = "sad";
        actual = timeMap.get("alice", 3);

        assertEquals(expected, actual);
    }
}
