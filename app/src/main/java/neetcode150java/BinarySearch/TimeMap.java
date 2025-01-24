package neetcode150java.BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Time Based Key-Value Store
 * LeetCode 981
 * 
 * Implement a time-based key-value data structure that supports:
 * 
 * Storing multiple values for the same key at specified time stamps
 * Retrieving the key's value at a specified timestamp
 * Implement the TimeMap class:
 * 
 * TimeMap() Initializes the object.
 * void set(String key, String value, int timestamp) Stores the key key with the
 * value value at the given time timestamp.
 * String get(String key, int timestamp) Returns the most recent value of key if
 * set was previously called on it and the most recent timestamp for that key
 * prev_timestamp is less than or equal to the given timestamp (prev_timestamp
 * <= timestamp). If there are no values, it returns "".
 * Note: For all calls to set, the timestamps are in strictly increasing order.
 * 
 * Example 1:
 * 
 * Input:
 * ["TimeMap", "set", ["alice", "happy", 1], "get", ["alice", 1], "get",
 * ["alice", 2], "set", ["alice", "sad", 3], "get", ["alice", 3]]
 * 
 * Output:
 * [null, null, "happy", "happy", null, "sad"]
 * 
 * Explanation:
 * TimeMap timeMap = new TimeMap();
 * timeMap.set("alice", "happy", 1); // store the key "alice" and value "happy"
 * along with timestamp = 1.
 * timeMap.get("alice", 1); // return "happy"
 * timeMap.get("alice", 2); // return "happy", there is no value stored for
 * timestamp 2, thus we return the value at timestamp 1.
 * timeMap.set("alice", "sad", 3); // store the key "alice" and value "sad"
 * along with timestamp = 3.
 * timeMap.get("alice", 3); // return "sad"
 * Constraints:
 * 
 * 1 <= key.length, value.length <= 100
 * key and value only include lowercase English letters and digits.
 * 1 <= timestamp <= 1000
 * 
 */
public class TimeMap {
    HashMap<String, List<ValueAndTimestamp>> map;
    final int MAX_SIZE = 1000;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            ArrayList<ValueAndTimestamp> list = new ArrayList<>();
            list.add(new ValueAndTimestamp(value, timestamp));
            map.put(key, list);
        } else {
            List<ValueAndTimestamp> list = map.get(key);
            list.add(new ValueAndTimestamp(value, timestamp));
        }
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<ValueAndTimestamp> list = map.get(key);

        int leftIndex = 0;
        int rightIndex = list.size() - 1;
        String result = "";

        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int middleTimestamp = list.get(middleIndex).getTimestamp();

            if (middleTimestamp <= timestamp) {
                result = list.get(middleIndex).getValue();
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return result;
    }

}

class ValueAndTimestamp {
    private final String value;
    private final int timestamp;

    public ValueAndTimestamp(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    public int getTimestamp() {
        return timestamp;
    }
}