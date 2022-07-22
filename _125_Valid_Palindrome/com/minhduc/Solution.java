package com.minhduc;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        String newS = validate(s);
        StringBuilder temp = new StringBuilder();
        for(int i = newS.length() - 1; i >= 0; i--) {
            temp.append(newS.charAt(i));
        }
        String tempS = temp.toString();
        return newS.equals(tempS);
    }

    public String validate(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(65 <= s.charAt(i) && s.charAt(i) <= 90) {
                char c = (char) (s.charAt(i) + 32);
                sb.append(c);
            } else if((97 <= s.charAt(i) && s.charAt(i) <= 122) || (48 <= s.charAt(i) && s.charAt(i) <= 57)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
