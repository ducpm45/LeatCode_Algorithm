package com.minhduc;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 231 - 1
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        do {
            n = sumSquaresOfDigits(n);
            if (n == 1) {
                return true;
            }
        } while (set.add(n));
        return false;
    }

    public int sumSquaresOfDigits(int n) {
        if (n < 10) return n * n;
        int sum = 0;
        while (true) {
            int lastDigit = n % 10;
            n = n / 10;
            sum += lastDigit * lastDigit;
            if (n < 10) {
                sum += n * n;
                break;
            }

        }
        return sum;
    }
}
