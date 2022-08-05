package com.minhduc;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String str = "";
        binaryTreeSearch(result, root, str);
        return result;
    }

    public void binaryTreeSearch(List<String> list, TreeNode root, String str) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            str += String.valueOf(root.val);
            list.add(str);
            return;
        }
        str += root.val + "->";
        if(null != root.left) binaryTreeSearch(list, root.left, str);
        if(null != root.right) binaryTreeSearch(list, root.right, str);
    }
}
