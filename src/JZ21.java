package src;

import java.util.Arrays;

import lib.function;

public class JZ21 {
    public int[] exchange(int[] nums) {

        //双指针
        int oddPoint=nums.length-1,evenPoint=0;


        while(oddPoint>evenPoint){
            while(oddPoint>=0&& nums[oddPoint]%2!=1){
                oddPoint--;
            }
            while(evenPoint<nums.length&&nums[evenPoint]%2!=0){
                evenPoint++;
            }
            if(oddPoint<=evenPoint)
                break;
            swap(nums, oddPoint--, evenPoint++);
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        new JZ21().exchange(new int[]{1,3,2,4});
    }
    
}
