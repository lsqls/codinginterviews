package src;


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class JZ8 {
    //二叉树中序遍历顺序的下一个结点并且返回
    //画个二叉树的图,分情况讨论:

    //https://uploadfiles.nowcoder.com/images/20200526/284295_1590477193692_99D648423BB3F2113395149399A1462A
    //1.当前结点有右孩子结点，那么下一节点就是：右孩子结点的最左孩子结点,如果右孩子结点没有左孩子就是自己
    //【无右孩子节点】
    //2.当前结点是父亲结点的左孩子,下一个节点就是父亲节点
    //3.当前结点为父亲结点的右孩子结点，本质还是[2]那一类
    //4.最尾结点
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode p=pNode;
        if(p==null)
            return null;
         
        if(p.right!=null){
            //1
            p=p.right;
            while(p.left!=null)
                p=p.left;
            return p;
        }
        
        else{
            //2、3
            while(p.next!=null){
                if(p.next.left==p)
                    return p.next;
                p=p.next;
            }
             
        }
        //4
        return null;
    }
}
