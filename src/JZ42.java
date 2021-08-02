package src;

public class JZ42 {
    //用 f(i) 代表以第 i 个数结尾的「连续子数组的最大和」。 f(i)=max{f(i−1)+nums[i],nums[i]}
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
