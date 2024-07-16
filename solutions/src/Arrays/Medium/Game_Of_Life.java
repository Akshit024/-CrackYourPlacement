package Arrays.Medium;

public class Game_Of_Life {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int x[] = {-1,-1,-1,0,0,1,1,1};
        int y[] = {-1,0,1,-1,1,-1,0,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int lives =0;
                for(int k=0;k<8;k++){
                    int posi =i+x[k];
                    int posj =j+y[k];
                    if(posi>=0 && posi<n && posj>=0 && posj<m){
                        if(board[posi][posj]>=1) lives++;
                        // System.out.print(board[posi][posj]+" ");
                    }
                }
                System.out.print("*"+lives+" ");
                if(board[i][j]==0 && lives == 3){
                    board[i][j]=-1;
                }
                if(board[i][j]==1){
                    if(lives!=3 && lives!=2){
                        board[i][j]=2;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==-1) board[i][j]=1;
                if(board[i][j]==2) board[i][j]=0;
            }
        }
    }
}
