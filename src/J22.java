package src;

import lib.leetcode.ListNode;

public class J22 {
    //经典快慢指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head,slow=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
