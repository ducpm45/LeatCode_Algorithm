package com.minhduc;

import java.util.ArrayList;
import java.util.List;
/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Example 1:
 *
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 *
 * Example 2:
 *
 * Input: rowIndex = 0
 * Output: [1]
 *
 * Example 3:
 *
 * Input: rowIndex = 1
 * Output: [1,1]
 *
 * Constraints:
 *
 * 0 <= rowIndex <= 33
 *
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        if(rowIndex == 0) return row1;
        List<Integer> currentRow = row1;
        for( int i = 1; i <= rowIndex; i++) {
            currentRow = listAtNextRow(currentRow);
        }
        return currentRow;
    }

    public List<Integer> listAtNextRow(List<Integer> listAtCurrentRow) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 0; i < listAtCurrentRow.size() - 1; i++) {
            result.add(listAtCurrentRow.get(i) + listAtCurrentRow.get(i + 1));
        }
        result.add(1);
        return result;
    }
}
