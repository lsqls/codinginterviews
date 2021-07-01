package src;

import lib.leetcode.TreeNode;

public class JZ68_2 {
    // 前提：所有节点的值都是唯一的。
    // p、q 为不同节点且均存在于给定的二叉树中。
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if(root==null)
            return null;
        if(root==p||root==q){
            return root;
        }
        
        TreeNode leftAncestor=lowestCommonAncestor(root.left, p, q),rightAncestor=lowestCommonAncestor(root.right, p, q);

        //注意，两边都返回 not null 的时候，返回root
        return leftAncestor!=null?(rightAncestor!=null?root:leftAncestor):rightAncestor;
    }
}
