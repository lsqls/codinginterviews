package src;

import lib.leetcode.TreeNode;

public class JZ28 {
    //判断树对称->左右子树对称？->左右节点相等，左子树的左子树和右子树的右子树、左子树的右子树和右子树的左子树对称
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return  isSymmetric(root.left,root.right);

        
        
    }
    public boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if(left==null||right==null)
            return false;
        return left.val==right.val&&isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
}
