import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(find(n,k,arr));
            t--;
        }
    }
    static int find(int n,int k,int arr[]){
        int ans = 0;
        ArrayList<Integer>[] list = new ArrayList[k];
        for(int i:arr){
            int pos = i%k;
            list[pos].add(i);
        }
        for(int i=0;i<k;i++){
            Collections.sort(list[i]);

        }
        return ans;
    }
    static void print(ArrayList<int[]> list){
        System.out.println(list.size());
        for(int[] i : list){
            System.out.println(i[0]+" "+i[1]);
        }
    }
}