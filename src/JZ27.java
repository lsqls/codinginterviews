package src;

import lib.leetcode.TreeNode;

public class JZ27 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)  return null;
        TreeNode newLeft=invertTree(root.right),newRigth=invertTree(root.left);
        root.left=newLeft;
        root.right=newRigth;
        return root;
    }
}
