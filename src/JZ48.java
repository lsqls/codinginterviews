package src;

import java.util.Arrays;

public class JZ48 {
    // 动态规划
    // f(i) 表示 以 s[i] 为结尾的最长的的不重复字符串的长度

    //f(i)=f(i-1)+1 if s[i] not in s.substt(i-f(i-1),i) else f(i)= i- last position of s[i] 
    //拿个数组记录last position of s[i] 


    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==0)
            return 0;
        int[] dp=new  int[len];
        int[] mark=new int[128];
        //这里记得初始化为负值
        Arrays.fill(mark, -1);
        int max=1;
        dp[0]=1;
        mark[s.charAt(0)]=0;
        for(int i=1;i<len;i++){


            char ch=s.charAt(i);

            int lastChPositin=mark[ch];
            mark[ch]=i;

            if(lastChPositin<i-dp[i-1]){
                dp[i]=dp[i-1]+1;
            }
            else{
                dp[i]=i-lastChPositin;
            }
            max=Math.max(max, dp[i]);
            
        }
        return max;

    }
}
