package src;

public class JZ13 {


    int cnt=0;
    int gm,gn;
    public int movingCount(int m, int n, int k) {


        gm=m;gn=n;
        int[][] map=new int[m][n];
        int l=Math.max(m, n);

        int[] digitSums=new int[l];

        for(int i=0;i<l;i++){
            digitSums[i]=digitSum(i);
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[i][j]=(digitSums[i]+digitSums[j])>k?0:1;
            }
        }

        dfs(0,0,map);
        return cnt;
    }

    int[][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private void dfs(int i, int j, int[][] map) {
        if(i<0||j<0||i>=gm||j>=gn)
            return;
        if(map[i][j]==0)
            return;

        cnt++;
        map[i][j]=0;

        for(int[] dir:dirs){
            dfs(i+dir[0], j+dir[1], map);
        }
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
