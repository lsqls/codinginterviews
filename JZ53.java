public class JZ53 {
    //在排序数组中查找数字 :寻找右边界（下一个插入点），target的插入点减去target-1的插入点就是长度
    public int search(int[] nums, int target) { 
        return getInsertIndex(nums, target)-getInsertIndex(nums, target-1);          
    }
    

    int getInsertIndex(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
