package Study;
import java.util.*;

public class fenwickTree {
    static int find(int arr[],int dist,int n){
        int ans = Math.max(arr[0],2*(dist-arr[n-1]));
        for(int i=1;i<n;i++) {
            ans = Math.max(ans, arr[i] - arr[i - 1]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int e = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(find(arr,e,n));
            t--;
        }
    }
}
