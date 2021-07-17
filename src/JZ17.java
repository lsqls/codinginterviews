package src;

public class JZ17 {
    public int[] printNumbers(int n) {
        int max=0;
        for(int i=0;i<n;i++){
            max=max*10+9;
        }

        int[] ret=new int[max];

        for(int i=1;i<=max;i++){
            ret[i-1]=i;
        }

        return ret;


        
    }
}
