package src;

import java.util.HashMap;

import lib.leetcode.TreeNode;

public class JZ7 {
    //前提：假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    //前序：确定根节点，中序：确定左右子树 


    //中序遍历的【节点值-位置】哈希表
    HashMap<Integer,Integer> inhashmap=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int  i=0;i<inorder.length;i++)
            inhashmap.put(inorder[i],i);
        return buildTreeCore(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inhashmap);
    }
    
    private TreeNode buildTreeCore(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,HashMap<Integer, Integer> inhashmap) {
        if(preEnd<preStart||inEnd<inStart||preorder.length==0||inorder.length==0)
            return null;
        int rootVal=preorder[preStart];
        int rootIndex=inhashmap.get(rootVal);
        TreeNode root=new TreeNode(rootVal); 
        root.left=buildTreeCore(preorder,preStart+1,rootIndex-inStart+preStart,inorder,inStart,rootIndex-1,inhashmap);
        root.right=buildTreeCore(preorder,rootIndex-inStart+preStart+1,preEnd,inorder,rootIndex+1,inEnd,inhashmap);
        return root;
    }


}
