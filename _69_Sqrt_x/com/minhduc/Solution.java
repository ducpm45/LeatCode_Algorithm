package com.minhduc;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 * <p>
 * Note: You are not allowed to use any built-in exponent function or operator,
 * such as pow(x, 0.5) or x ** 0.5.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 4
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= x <= 231 - 1
 */
public class Solution {
    /**
     * Linear search
     */
    public int mySqrt(int x) {
        int temp = 0;
        while (temp * temp <= x) {
            temp++;
        }
        return temp - 1;
    }

    /**
     * Binary search
     */
    public int mySqrt2(int x) {
        if (x == 0) return 0;

        long left = 1;
        long right = x / 2;
        int result = 1;
        while (left <= right) {
            long mid = (left + right) / 2;
            long temp = mid * mid;
            if (temp == x) {
                return (int) mid;
            } else if (temp < x) {
                result = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
