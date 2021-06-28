package src;

import lib.leetcode.ListNode;

public class J18 {
    //删除链表的节点:经典链表递归
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;

        head.next=deleteNode(head.next, val);
        return head;
    }
}
