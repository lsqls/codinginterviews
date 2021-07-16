package src;

public class JZ12 {
    //矩阵中的路径:回溯
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(exist(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    int[][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word,int x,int y,int checkIndex) {

        if(checkIndex==word.length())
            return true;
        if(x<0||x>=board.length||y<0||y>=board[0].length)
            return false;
        char checkChar=board[x][y];
        if(checkChar=='#'||checkChar!=word.charAt(checkIndex))
            return false;
        board[x][y]='#';
        for(int[] dir:dirs){
            if(exist(board, word, x+dir[0], y+dir[1], checkIndex+1))
                return true;
        }
        board[x][y]=checkChar;
        return false;
    }
}
