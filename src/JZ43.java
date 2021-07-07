package src;

public class JZ43 {
    // 想象一个行李箱的滚轮密码锁，固定其中的某一位(本题将其固定为1)，然后可以随意滑动其他位
    // 1004、1014、1024 分析：当前位 <1 ==1 >1 三种情况
    // 具体看 https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/solution/dong-hua-mo-ni-wo-tai-xi-huan-zhe-ge-ti-vxzwc/

    public int countDigitOne(int n) {
        //高位
        int high = n;
        //低位
        int low = 0;
        //当前位
        int curDigit = 0;
        int count = 0;
        int num = 1;
        while (high != 0 || curDigit!=0) {
            curDigit = high % 10;
            high /= 10;
            if (curDigit == 0)
                count += high * num;
            else if (curDigit== 1) 
                count += high * num + 1 + low; 
            else 
                count += (high + 1) * num;
            //低位
            low += curDigit * num ;                  
            num *= 10;
        }
        return count;
    }


    
}
