import java.util.*;

public class Main {
    static List<int[]> find(long arr[], int n) {
        List<int[]> ans = new ArrayList<>();
        int neg =0;
        for(long i : arr){
            if(i == 0) return new ArrayList<>();
            if(i<0) neg++;
        }

        if(neg%2 != 0){
            return new ArrayList<>();
        }
        ans.add(new int[]{1,0});
        return ans;
    }

    static void print(List<int[]> ans){
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)[0]+" "+ans.get(i)[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            List<int[]> ans = find(arr, n);
            print(ans);
            t--;
        }
        sc.close();
    }
}
