package src;

public class JZ33 {


    // 后序遍历：末尾为父母节点，检查左右树的值是否符合二叉搜索树的要求。递归检查左右子树
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder,0,postorder.length-1);
        
    }
    public boolean verifyPostorder(int[] postorder,int start,int end){
        if(start>=end)
            return true;

        int rootVal=postorder[end];
        int small=start;
        while(postorder[small]<rootVal)
            small++;
        int index=small;
        while(index<end){
            if(postorder[index]<rootVal)
                return false;
            index++;
        }
        return verifyPostorder(postorder,start,small-1)&&verifyPostorder(postorder,small,end-1);
    }
}
