package com.minhduc;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length != nums[nums.length - 1]) return nums[nums.length - 1] + 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return 0;
    }
}
