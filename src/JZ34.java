package src;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import lib.leetcode.TreeNode;

public class JZ34 {

    //回溯法：
    List<List<Integer>> ret=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        Deque<Integer> path=new LinkedList<>();
        findPath(root,sum,path);
        return ret;
    }
    public boolean  isLeaf(TreeNode node){
        return node!=null&&node.left==null&&node.right==null;
    }
    public void findPath(TreeNode root,int sum,Deque<Integer> path) {
        if(root==null)
            return;
        
        sum-=root.val;
        path.addLast(root.val);
        if(isLeaf(root)&&sum==0){
            List<Integer> retPath=new ArrayList<>(path);
            ret.add(retPath);
        }
        else{
            findPath(root.left,sum,path);
            findPath(root.right,sum,path);
        }
        path.removeLast();
    }
}
