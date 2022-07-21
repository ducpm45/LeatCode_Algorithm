package com.minhduc;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * Example 1:
 * <p>
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * Example 2:
 * <p>
 * Input: numRows = 1
 * Output: [[1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        result.add(row1);
        for (int i = 1; i < numRows; i++) {
            result.add(listAtNextRow(result.get(i - 1)));
        }
        return result;
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
