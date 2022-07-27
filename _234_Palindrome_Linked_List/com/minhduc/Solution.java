package com.minhduc;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        List<Integer> headList = new ArrayList<>();
        ListNode currentNode = head;
        while(currentNode != null) {
            stack.add(currentNode.val);
            headList.add(currentNode.val);
            currentNode = currentNode.next;
        }
        List<Integer> newList = new ArrayList<>();
        while(!stack.isEmpty()) {
            newList.add(stack.pop());
        }
        return headList.equals(newList);
    }
}
