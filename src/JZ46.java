package src;

public class JZ46 {
    public int translateNum(int inum) {
        //dp：我们可以用 f(i)表示以第 i 位结尾的前缀串翻译的方案数，使用滚动数组进行优化
        //f(i)=f(i−1)+f(i−2)[i−1≥0,10≤x≤25]，第 i - 1位和第 i位形成的数字 x
        // https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/solution/mian-shi-ti-46-ba-shu-zi-fan-yi-cheng-zi-fu-chua-6/
        char [] num=String.valueOf(inum).toCharArray();
        int length=num.length;
        if(length==0)
            return 0;
        int fi2=1,fi1=1,fi=1;
        for(int i=1;i<length;i++){
            if(num[i-1]=='1'||(num[i-1]=='2'&&num[i]<'6')){
                fi=fi1+fi2;   
            }else{
                fi=fi1;
            }

            fi2=fi1;
            fi1=fi;
        }   
        return fi;
            
                
    }
}
