package com.minhduc;

/**
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
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
 * Input: columnNumber = 1
 * Output: "A"
 * <p>
 * Example 2:
 * <p>
 * Input: columnNumber = 28
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: columnNumber = 701
 * Output: "ZY"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= columnNumber <= 231 - 1
 */
public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        if (columnNumber <= 0) {
            sb.append("");
        }
        while (true) {
            if (columnNumber <= 26) {
                sb.append(columnTitle(columnNumber));
                break;
            }
            if (columnNumber % 26 == 0) {
                sb.append(columnTitle(26));
                columnNumber = columnNumber / 26 - 1;
            } else {
                sb.append(columnTitle(columnNumber % 26));
                columnNumber = columnNumber / 26;
            }
        }

        return sb.reverse().toString();
    }

    public String columnTitle(int num) {
        char c = (char) (num + 64);
        return String.valueOf(c);
    }
}
