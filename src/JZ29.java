package src;

import java.util.LinkedList;
import java.util.List;

public class JZ29 {
    // 顺时针打印矩阵：大循环嵌套四个循环：注意只剩一行和一列的情况
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> iList=new LinkedList<>();
        
        int startx=0,starty=0,endx=matrix.length-1,endy=matrix[0].length-1;

        while(startx<=endx&&starty<=endy){
            for(int j=starty;j<=endy;j++){
                System.out.println(matrix[startx][j]);
                iList.add(matrix[startx][j]);
            }
            for(int i=startx+1;i<=endx;i++){
                System.out.println(matrix[i][endy]);
                iList.add(matrix[i][endy]);
            }
            if(endx==startx)//处理只剩一行的情况
                break;
            
            for(int j=endy-1;j>=starty;j--){
                System.out.println(matrix[endx][j]);
                iList.add(matrix[endx][j]);
            }
            
            if(endy==starty)//处理只剩一列的情况
                break;
            for(int i=endx-1;i>=startx+1;i--){
                System.out.println(matrix[i][starty]);
                iList.add(matrix[i][starty]);
            } 
            startx++;starty++;
            endx--;endy--;
        }
        return iList;

    }
}
