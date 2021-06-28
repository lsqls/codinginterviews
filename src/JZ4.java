package src;

public class JZ4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        int rows=matrix.length;
        if (rows==0)
            return false;
        int cols=matrix[0].length;
        if(cols==0)
            return false;

        
        // 从右上角开始搜索，逐步缩小搜索范围
        int i=rows-1;
        int j=0;


        while(i>=0&&i<rows&&j>=0&&j<cols){
            int val=matrix[i][j];
            if(val==target)
                return true;
            else if(val>target)
                i--;
            else 
                j++;
        }
        return false;
 
    
    }
}
