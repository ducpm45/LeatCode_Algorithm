package com.minhduc;

import java.util.Stack;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 *
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Example 3:
 *
 * Input: head = []
 * Output: []
 *
 * Constraints:
 *
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 *
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Solution {
    /**
     * Use stack
     */
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Stack<Integer> stack = new Stack<>();
        ListNode currentNode = head;
        while(currentNode != null) {
            stack.add(currentNode.val);
            currentNode = currentNode.next;
        }
        head.val = stack.pop();
        currentNode = head;
        while(!stack.isEmpty()) {
            currentNode.next.val = stack.pop();
            currentNode = currentNode.next;
        }
        return head;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode currentNode = head;
        ListNode nextNode = null;
        while(currentNode.next != null) {
            nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
}
