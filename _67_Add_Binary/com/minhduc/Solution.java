package com.minhduc;

import java.util.Stack;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() > b.length()) {
            StringBuilder temp = new StringBuilder();
            temp.append("0".repeat(a.length() - b.length()));
            b = temp.append(b).toString();
        } else if(a.length() < b.length()) {
            StringBuilder temp = new StringBuilder();
            temp.append("0".repeat(b.length() - a.length()));
            a = temp.append(a).toString();
        }
        int i = a.length()-1;
        int memo = 0;
        Stack<Character> stack = new Stack<>();
        while(i >= 0) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            if(charA == '0' && charB == '0') {
                if(memo == 1) {
                    stack.push('1');
                    i--;
                    memo--;
                } else {
                    stack.push('0');
                    i--;
                }
            }
            if((charA == '0' && charB == '1') || (charA == '1' && charB == '0')) {
                if(memo == 1) {
                    stack.push('0');
                    i--;
                } else {
                    stack.push('1');
                    i--;
                }
            }
            if(charA == '1' && charB == '1') {
                if(memo == 1) {
                    stack.push('1');
                    i--;
                } else {
                    stack.push('0');
                    i--;
                    memo++;
                }
            }
        }
        if(memo == 1) {
            stack.push('1');
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
