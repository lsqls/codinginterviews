package src;

import lib.leetcode.TreeNode;

public class JZ68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 前提：所有节点的值都是唯一的。
        // p、q 为不同节点且均存在于给定的二叉搜索树中。
        // 利用二叉搜索数的性质
        int rootVal=root.val,pVal=p.val,qVal=q.val;

        if((rootVal>qVal&&rootVal<pVal)||(rootVal<qVal&&rootVal>pVal)||(rootVal==qVal)||(rootVal==pVal)){
            return root;
        }

        else if(qVal<rootVal&&pVal<rootVal){
            return lowestCommonAncestor(root.left, p, q);
        }
        else{
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
