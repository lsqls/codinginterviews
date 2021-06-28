package src;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lib.leetcode.TreeNode;

public class JZ32 {

    // 树的层序遍历:QUEUE
    public int[] levelOrder(TreeNode root) {


        if(root==null)
            return new int[]{};


        List<Integer> iList=new ArrayList<>();
        Queue<TreeNode> nQueue=new LinkedList<>();


        nQueue.add(root);



        while(!nQueue.isEmpty()){

            TreeNode node=nQueue.poll();

            iList.add(node.val);

            if(node.left!=null)
                nQueue.add(node.left);
            if(node.right!=null)
                nQueue.add(node.right);
        }

        return iList.stream().mapToInt(i->i).toArray();
    }
}
