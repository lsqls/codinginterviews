package src;

import lib.leetcode.ListNode;

public class JZ24 {
    // 反转链表:保存四个节点
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;

        if(head==null||head.next==null)
            return head;

        ListNode cur=head,next,nnext,nnnext,ret=head.next;
        while(cur!=null){
            next=cur.next;
            if(next==null)
                break;
            nnext=next.next;   
            next.next=cur;

            //swap
            if(nnext==null)
                break;
            nnnext=nnext.next;
            cur.next=nnnext;
            cur=nnext;
            
        }
        return ret;
    }
}
