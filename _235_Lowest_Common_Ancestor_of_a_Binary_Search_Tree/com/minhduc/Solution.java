package com.minhduc;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val) return p;
        if (q.val == root.val) return q;
        if ((p.val > root.val && q.val < root.val) || (p.val < root.val && q.val > root.val)) return root;
        if (p.val < root.val) return lowestCommonAncestor(root.left, p, q);
        return lowestCommonAncestor(root.right, p, q);
    }
}
