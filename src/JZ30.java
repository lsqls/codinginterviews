package src;

import java.util.Stack;


class JZ30{
    
}
class MinStack{
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()||val<=getMin()){
            minStack.push(val);
        }
            
    }
    
    public void pop() {
        int popVal=stack.pop();
        if(popVal==getMin()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
