import java.util.*;
public class Main {
    static long find(int[] arr, int n){
        int ans = 0;
        boolean flag = false;
        ArrayList<String> s = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder();
            int num = arr[i];
            while(num>0){
                sb.append(num%2);
                num = num/2;
            }
            s.add(sb.toString());
            if(ans == -1 || ans == sb.length()){
                ans = sb.length();
            }else{
                flag = true;
            }
            ans = Math.max(ans,sb.length());
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(find(arr,n));
            t--;
        }
    }
}