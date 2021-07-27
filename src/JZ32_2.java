package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lib.leetcode.TreeNode;

public class JZ32_2 {
    //双栈轮流存储层节点
    public List<List<Integer>> levelOrder(TreeNode root) {
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        List<List<Integer>> ret=new ArrayList<>();
        if(root==null)
            return ret;
        stack1.push(root);
        int levelNum=1;
        List<Integer> level=new ArrayList<>();
        while(!stack1.isEmpty()||!stack2.isEmpty()){
            if(levelNum%2==1){
                level=new ArrayList<>();
                while(!stack1.isEmpty()){
                    TreeNode node=stack1.pop();
                    level.add(node.val);
                    if(node.left!=null)
                        stack2.push(node.left);
                    if(node.right!=null)
                        stack2.push(node.right);
                }
            }
            else{
                level=new ArrayList<>();
                while(!stack2.isEmpty()){
                    TreeNode node=stack2.pop();
                    level.add(node.val);
                    if(node.right!=null)
                        stack1.push(node.right);
                    if(node.left!=null)
                        stack1.push(node.left);
                }
            }

            levelNum++;
            ret.add(level);
        }
        return ret;
        
    }
}
