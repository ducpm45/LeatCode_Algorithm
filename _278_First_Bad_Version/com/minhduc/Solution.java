package com.minhduc;

public class Solution extends VersionControl{
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left <= right) {
            int pivot = (left+right)/2;
            if(!isBadVersion(pivot)) {
                left = pivot + 1;
            } else {
                if(!isBadVersion(pivot - 1)) {
                    return pivot;
                }
                right = pivot - 1;
            }
        }
        return 1;
    }
}
