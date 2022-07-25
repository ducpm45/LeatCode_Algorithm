package com.minhduc;

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * Example 1:
 * <p>
 * Input: columnTitle = "A"
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: columnTitle = "AB"
 * Output: 28
 * <p>
 * Example 3:
 * <p>
 * Input: columnTitle = "ZY"
 * Output: 701
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */
public class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle.length() == 1) {
            return columnTitle.charAt(0) - 64;
        }
        int num = (columnTitle.charAt(0) - 64);
        for (int i = 1; i < columnTitle.length(); i++) {
            num = num*26 + columnTitle.charAt(i) - 64;
        }
        return num;
    }


}
