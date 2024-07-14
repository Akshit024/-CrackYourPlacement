public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int n =matrix.length;
        int m =matrix[0].length;
        boolean ith = false;
        boolean jth = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    if(i==0) ith =true;
                    if(j==0) jth =true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
            }
        }
        if(jth){
            for(int i=0;i<n;i++) matrix[i][0]=0;
        }
        if(ith){
            for(int i=0;i<m;i++) matrix[0][i]=0;
        }
    }
}
