package src;

public class JZ13 {


    int gm,gn,gk;
    public int movingCount(int m, int n, int k) {
        gm=m;gn=n;gk=k;
        boolean[][] checked=new boolean[m][n];

        return dfs(0,0, checked);
    }

    int[][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int dfs(int i, int j, boolean[][] checked) {
        if(i<0||j<0||i>=gm||j>=gn)
            return 0;
        if(checked[i][j]==true)
            return 0;
        checked[i][j]=true;


        if(digitSum(i)+digitSum(j)>gk)
            return 0;

        int cnt=1;
        for(int[] dir:dirs){
            cnt+=dfs(i+dir[0], j+dir[1],checked);
        }

        return cnt;

        
    }


    int digitSum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        new JZ13().digitSum(213);
    }
    
}
