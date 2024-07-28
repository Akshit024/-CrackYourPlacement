import java.util.*;

public class Main {
    static int find(int n) {
        int ans =0;
        int pow = 1;
        while(n>0){
            int rem = n%3;
            ans = ans + (rem*pow);
            pow = pow*10;
            n = n/3;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(find(n));
            t--;
        }
        sc.close();
    }
}
