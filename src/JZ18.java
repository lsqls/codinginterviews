package src;

import lib.leetcode.ListNode;

public class JZ18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;

        head.next=deleteNode(head.next, val);
        return head;
    }
}
