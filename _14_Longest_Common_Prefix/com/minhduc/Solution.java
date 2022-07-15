package com.minhduc;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] firstStringArr = strs[0].toCharArray();
        char[] lastStringArr = strs[strs.length-1].toCharArray();
        for(int i = 0; i < firstStringArr.length; i++) {
            if(firstStringArr[i] == lastStringArr[i]) {
                result.append(firstStringArr[i]);
            } else {
                return result.toString();
            }
        }
        return result.toString();
    }
}
