package src;


public class JZ51 {


    //归并排序，在合并有序数组时计算逆序对
    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return cnt;
    }

    int cnt=0;


    void mergeSort(int[] nums,int left,int right){


        if(left>=right){
            return;
        }

        int mid=(left+right)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        
        merge(nums,left,mid,mid+1,right);
        
    }
    

    private void merge(int[] nums, int left1, int right1, int left2, int right2) {


        int[] mergeNums=new int[right2-left1+1];

        int index1=left1,index2=left2,mergeNumsIndex=0;

        while(index1<=right1&&index2<=right2){
            if(nums[index2]<nums[index1]){
                cnt+=right1-index1+1;
                mergeNums[mergeNumsIndex++]=nums[index2++];
            }
            else{
                mergeNums[mergeNumsIndex++]=nums[index1++];
            }

        }
        

        while(index1<=right1){
            mergeNums[mergeNumsIndex++]=nums[index1++];
        }
        while(index2<=right2){
            mergeNums[mergeNumsIndex++]=nums[index2++];
        }

        for(int i=0;i<mergeNums.length;i++){
            nums[left1+i]=mergeNums[i];
        }
    }

    public static void main(String[] args) {
        new JZ51().reversePairs(new int[]{4,1,5,8,4,2,1});
    }


    
}
