package com.minhduc;

import java.util.List;
import java.util.ArrayList;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * -100 <= Node.val <= 100
 * <p>
 * Follow up: Could you solve it both recursively and iteratively?
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return compareSymmetric(root.left, root.right);
    }

    private boolean compareSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return compareSymmetric(left.left, right.right) && compareSymmetric(left.right, right.left);
    }

}
