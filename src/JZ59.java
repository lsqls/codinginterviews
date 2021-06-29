package src;

import java.util.LinkedList;

public class JZ59 {

    //单调减队列（具体方法：抛弃新值左侧小值）

    public int[] maxSlidingWindow(int[] nums, int k) {



        
        int len=nums.length;

        if(len==0)
            return new int[]{};
        int[] ret=new int[len-k+1];
        LinkedList<Integer> iList=new LinkedList<>();
        for(int i=0;i<len;i++){


            if(!iList.isEmpty()&& i-iList.peekFirst()>=k){
                iList.removeFirst();
            }

            //在新加的值右边且小于（等于）新加的值都可以去除
            while(!iList.isEmpty()&&nums[i]>=nums[iList.peekLast()]){
                iList.removeLast();
            }
            iList.add(i);
            if(i-k+1>=0){
                ret[i-k+1]=nums[iList.peekFirst()];
            }
        }
        return ret;
    }
}
