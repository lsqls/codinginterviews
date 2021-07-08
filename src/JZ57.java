package src;

import java.util.ArrayList;

public class JZ57 {
    public  int[][] findContinuousSequence(int target) {
        ArrayList<int []> retList=new ArrayList<>();

        //滑动窗口
        int small=1,large=2,middle=(target+1)/2;
        int curSum=small+large;
        while(small<middle){
            if(curSum==target){
                int [] arr=new int [large-small+1];
                for(int i=small;i<=large;i++)
                    arr[i-small]=i;
                retList.add(arr);
                large++;
                curSum+=large;
            }
            else if(curSum<target){
                large++;
                curSum+=large;
            }
                
            else{
                curSum-=small;
                small++;
            }
                
        }
        return retList.toArray(new int[retList.size()][]);

    }

}
