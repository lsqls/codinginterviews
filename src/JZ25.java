package src;

import lib.leetcode.ListNode;

public class JZ25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(-1);
        ListNode l1cur=l1,l2cur=l2;
        ListNode nh=dummyHead;
        while(l1cur!=null||l2cur!=null){
            
            int val1=l1cur==null?Integer.MAX_VALUE:l1cur.val;
            int val2=l2cur==null?Integer.MAX_VALUE:l2cur.val;
            if(val1<val2){
                nh.next=l1cur;
                nh=l1cur;
                l1cur=l1cur.next;
            }
            else{
                nh.next=l2cur;
                nh=l2cur;
                l2cur=l2cur.next;
            }
            
        }
        return dummyHead.next;
    }
}
