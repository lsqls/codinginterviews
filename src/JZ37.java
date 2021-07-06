package src;

import java.util.Arrays;
import java.util.LinkedList;

import lib.leetcode.TreeNode;

public class JZ37 {
    // 前序遍历序列化 移除队列头节点反序列化
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer stringBuffer=new StringBuffer();
        serialize(root, stringBuffer);
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        return stringBuffer.toString(); 
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes= new LinkedList<String>(Arrays.asList(data.split(",")));
        return deserializeCore(nodes);
    }

    private TreeNode deserializeCore(LinkedList<String> nodes) {

        if(nodes.size()==0)
            return  null;

            
        String node=nodes.pollFirst();
        if(node.equals("null")){
            return null;
        }
        
        TreeNode root=new TreeNode(Integer.parseInt(node));
        root.left=deserializeCore(nodes);
        root.right=deserializeCore(nodes);
        return root;
    }

    public void serialize(TreeNode root,StringBuffer stringBuffer) {



        if(root==null){
            stringBuffer.append("null,");
            return;
        }
        stringBuffer.append(String.valueOf(root.val)+",");

        serialize(root.left,stringBuffer);
        serialize(root.right, stringBuffer);
        
    }
}
