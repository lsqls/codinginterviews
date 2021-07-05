package src;

import java.util.LinkedList;
import java.util.Queue;

public class JZ9_2 {

    //你只能使用队列的基本操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。
    
}
    
    
class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        int size=queue.size();
        queue.add(x);
        for(int i=0;i<size;i++){
            queue.add(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}



