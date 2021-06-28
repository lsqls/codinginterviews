package src;

import lib.leetcode.TreeNode;

public class JZ26 {

    //B是A的子结构， 即【A中有出现和B相同的结构和节点值】
    //A是选定的树根
    public boolean isSubStructure(TreeNode A, TreeNode B) {


        //约定空树不是任意一个树的子结构
        if(A==null||B==null)
            return false;
        return isInclude(A, B)||isSubStructure(A.left, B)||isSubStructure(A.right, B);

    }




    //【A中有出现和B相同的结构和节点值】
    public boolean isInclude(TreeNode A, TreeNode B) {

        if(A==null&&B==null)
            return true;
        if(A==null)
            return false;
        if(B==null)
            return true;
        return A.val==B.val&&isInclude(A.left, B.left)&&isInclude(A.right, B.right);
    }


    

}
