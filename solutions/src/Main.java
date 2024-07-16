public class Main {



    static boolean find(int a[][],int b[][]){
        int n = a.length;
        int m = a[0].length;
        for(int i=0;i<n;i++){
            int need =0;
            for(int j=0;j<m;j++){
                if(a[i][j] > b[i][j]){
                    need += a[i][j]-b[i][j];
                }
                else if(a[i][j]<b[i][j]){
                    need += a[i][j] + 3- b[i][j];
                }
            }
            if(need % 3 != 0) return false;
        }
        for(int i=0;i<m;i++){
            int need =0;
            for(int j=0;j<n;j++){
                if(a[j][i] > b[j][i]){
                    need += a[j][i]-b[j][i];
                }
                else if(a[j][i]<b[j][i]){
                    need += a[j][i] + 3- b[j][i];
                }
            }
            if(need % 3 != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int b[][] = {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(find(a,b));
    }
}