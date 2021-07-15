package src;

import java.util.Stack;

import lib.leetcode.ListNode;

public class JZ6 {
    public int[] reversePrint(ListNode head) {

        Stack<Integer> stack=new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int size=stack.size();
        int[] ret=new int[size];
        for(int i=0;i<size;i++)
          ret[i]=stack.pop();
        return ret;
    }
}
