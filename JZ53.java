public class JZ53 {
    //在排序数组中查找数字 :中心扩展
    public int search(int[] nums, int target) {
        int len=nums.length;

        if(len==0||target>nums[len-1]||target<nums[0])
            return 0;

        
        if(nums[0]==nums[len-1]&&nums[0]==target)
            return len;

        int index=getTargetIndex(nums, target);


        if(index==-1)
            return 0;

        int left=index,right=index;


        while(left-1>=0&&nums[left-1]==target)
            left--;
        while(right+1<len&&nums[right+1]==target)
            right++;
        return right-left+1;
        

        
        
    }
    

    int getTargetIndex(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                return mid;
            }

            

        }

        return -1;
    }
}
