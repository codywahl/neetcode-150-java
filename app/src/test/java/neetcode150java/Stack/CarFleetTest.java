package neetcode150java.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * 
 * Input: target = 10, position = [1,4], speed = [3,2]
 * Output: 1
 * Explanation: The cars starting at 1 (speed 3) and 4 (speed 2) become a fleet,
 * meeting each other at 10, the destination.
 * 
 * Example 2:
 * 
 * Input: target = 10, position = [4,1,0,7], speed = [2,2,1,1]
 * Output: 3
 * Explanation: The cars starting at 4 and 7 become a fleet at position 10. The
 * cars starting at 1 and 0 never catch up to the car ahead of them. Thus, there
 * are 3 car fleets that will arrive at the destination.
 */
public class CarFleetTest {
    @Test
    public void shouldPassTestCase1() {
        CarFleet carFleet = new CarFleet();
        int target = 10;
        int[] position = { 1, 4 };
        int[] speed = { 3, 2 };
        int expected = 1;
        int actual = carFleet.carFleet(target, position, speed);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPassTestCase2() {
        CarFleet carFleet = new CarFleet();
        int target = 10;
        int[] position = { 4, 1, 0, 7 };
        int[] speed = { 2, 2, 1, 1 };
        int expected = 3;
        int actual = carFleet.carFleet(target, position, speed);

        assertEquals(expected, actual);
    }
}
