package src;

public class JZ14 {
    //尽量分成 长度为 3 的段
    public int cuttingRope(int n) {

        if(n<4)
            return n-2;
        int mod=n%3,cnt=n/3;
        if(mod==0){
            return (int)Math.pow(3, cnt);
        }
        else if (mod==1){
            return (int)(Math.pow(3, cnt-1)*4);
        }

        else{
            return (int)(Math.pow(3, cnt)*2);
        }
    }
}
