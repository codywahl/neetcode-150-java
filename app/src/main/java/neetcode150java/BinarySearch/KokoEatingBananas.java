package neetcode150java.BinarySearch;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.min;

// cspell:ignore Koko
/**
 * Koko Eating Bananas
 * Leetcode 875
 * 
 * You are given an integer array piles where piles[i] is the number of bananas
 * in the ith pile. You are also given an integer h, which represents the number
 * of hours you have to eat all the bananas.
 * 
 * You may decide your bananas-per-hour eating rate of k. Each hour, you may
 * choose a pile of bananas and eats k bananas from that pile. If the pile has
 * less than k bananas, you may finish eating the pile but you can not eat from
 * another pile in the same hour.
 * 
 * Return the minimum integer k such that you can eat all the bananas within h
 * hours.
 * 
 * Example 1:
 * 
 * Input: piles = [1,4,3,2], h = 9
 * Output: 2
 * Explanation: With an eating rate of 2, you can eat the bananas in 6 hours.
 * With an eating rate of 1, you would need 10 hours to eat all the bananas
 * (which exceeds h=9), thus the minimum eating rate is 2.
 * 
 * Example 2:
 * 
 * Input: piles = [25,10,23,4], h = 4
 * Output: 25
 * 
 * Constraints:
 * 
 * 1 <= piles.length <= 1,000
 * piles.length <= h <= 1,000,000
 * 1 <= piles[i] <= 1,000,000,000
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        // 1) get minimum bananas per hour rate
        // which is determined by hours / piles
        // 2) get the maximum number of bananas per hour
        // which is determined by the maximum number of bananas in the piles
        // because there is no reason to eat slower than the maximum number of bananas

        // 3) binary search between the minimum and maximum number of bananas per hour
        // to find the minimum number of bananas per hour that can be eaten within h
        // hours

        // BPH = bananas per hour
        int minimumBPH = h / piles.length;
        int maximumBPH = minimumBPH;
        int maxHours = h;

        // could use Arrays.stream(piles).max().getAsInt();
        // but this is more efficient
        for (int pile : piles) {
            if (pile > maximumBPH) {
                maximumBPH = pile;
            }
        }

        // binary search
        // minimumBPH = left
        // maximumBPH = right
        while (minimumBPH < maximumBPH) {
            int mid = minimumBPH + (maximumBPH - minimumBPH) / 2;

            if (canEatAll(piles, maxHours, mid)) {
                maximumBPH = mid;
            } else {
                minimumBPH = mid + 1;
            }
        }

        return minimumBPH;
    }

    private boolean canEatAll(int[] piles, int maxHours, int bph) {
        int totalRequiredHours = 0;

        for (int bananasInPile : piles) {
            double hoursToEatPile = Math.ceil((double) bananasInPile / bph);
            totalRequiredHours += hoursToEatPile;

            if (totalRequiredHours > maxHours) {
                return false;
            }
        }

        return totalRequiredHours <= maxHours;
    }
}
