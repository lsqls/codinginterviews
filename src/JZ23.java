package src;

import lib.leetcode.ListNode;

public class JZ23 {
    //环的入口节点
    //有环时：快慢指针的路程等式：2(a+b)=a+(b+c)+b => a=c ,结论：快慢指针相遇点到环节点的距离和起点到环节点的距离相同
    //无环时：检测fast是否为null值
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;

        while(true){

            if(fast==null)
                return null;
        
            slow=slow.next;

            fast=fast.next;
            if(fast==null)  
                return null;
            fast=fast.next;


            if(fast==slow)
                break;
            
        }

        slow=head;


        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
