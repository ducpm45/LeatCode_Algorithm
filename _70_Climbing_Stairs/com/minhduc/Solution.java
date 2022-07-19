package com.minhduc;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 */
public class Solution {
    int[] arr = new int[46];
    public int climbStairs(int n) {

        if (arr[n] != 0) {
            return arr[n];
        }
        if (n == 1) arr[1] = 1;
        if (n == 2) arr[2] = 2;
        if (n > 2) {
            arr[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return arr[n];
    }
}
