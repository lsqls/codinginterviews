package src;

public class JZ10 {

    //dp 只保存相邻的三个状态
    // 斐波那契数列
    public int fib(int n) {

        if(n<2)
            return n;
        int n1=1,n2=0,ret=0;
        for(int i=0;i<n-1;i++){

            ret=(n1+n2)%1000000007;

            n2=n1;
            n1=ret;
        }
        return ret;
    }
}
