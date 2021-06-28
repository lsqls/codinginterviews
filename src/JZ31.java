package src;

import java.util.Stack;

public class JZ31 {
    // 假设压入栈的所有数字均不相等
    //pushed = [1,2,3,4,5], popped = [4,5,3,2,1] true
    //pushed = [1,2,3,4,5], popped = [4,3,5,1,2] false


    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> iStack=new Stack<>();

        int pushIndex=0,popIndex=0;


        int len=pushed.length;

        while(pushIndex<len){
            iStack.push(pushed[pushIndex++]);

            while(!iStack.isEmpty()&&iStack.peek()==popped[popIndex]){
                iStack.pop();
                popIndex++;
            }
        }

        return popIndex==len;



    }
    public static void main(String[] args) {
        new JZ31().validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1});
    }
}
