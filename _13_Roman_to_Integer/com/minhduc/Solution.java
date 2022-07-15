package com.minhduc;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Use map
     */
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        result += map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;
    }

    /**
     * Not use map
     */
    public int romanToInt2(String s) {
        int result = 0;
        int a = 0;
        int b = 1001;
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            if (charS == 'I') {
                a = 1;
            } else if (charS == 'V') {
                a = 5;
            } else if (charS == 'X') {
                a = 10;
            } else if (charS == 'L') {
                a = 50;
            } else if (charS == 'C') {
                a = 100;
            } else if (charS == 'D') {
                a = 500;
            } else if (charS == 'M') {
                a = 1000;
            }
            if (a > b) {
                a -= b * 2;
            }
            b = a;
            result += a;
        }
        return result;
    }
}
