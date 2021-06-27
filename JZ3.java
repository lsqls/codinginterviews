import lib.function;

public class JZ3 {
    public int findRepeatNumber(int[] nums) {
        //[2, 3, 1, 0, 2, 5, 3]
        //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的
        //限定数字大小范围小于数组长度，基本就是原地交换了



        int index=0;
        while(index<nums.length){


            int toIndex=nums[index];
            if(toIndex==index){
                index++;
                continue;
            }
            if(nums[toIndex]==nums[index])
                return nums[index];


            swap(nums, toIndex, index);
        }
        return -1;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
}
