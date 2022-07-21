package com.minhduc;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: root = []
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -104 <= Node.val <= 104
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int depthLeft = depth(root.left);
        int depthRight = depth(root.right);
        if(Math.abs(depthLeft - depthRight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int depthLeft = depth(root.left) + 1;
        int depthRight = depth(root.right) + 1;

        return Math.max(depthLeft, depthRight);
    }
}
