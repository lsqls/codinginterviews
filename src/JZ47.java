package src;

public class JZ47 {
    //从终点开始dp，注意边界的处理
    public int maxValue(int[][] grid) {
        int rows=grid.length,cols=grid[0].length;
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                grid[i][j] += Math.max((i+1)>=rows?0:grid[i+1][j],(j+1)>=cols?0:grid[i][j+1]);
            }
        }
        return grid[0][0];
    }
}
