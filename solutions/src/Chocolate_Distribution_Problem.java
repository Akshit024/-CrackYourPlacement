import java.util.*;

public class Chocolate_Distribution_Problem {
    public static int chocolateDistribution(int arr[], int m) {
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-m; i++) {
            int diff = arr[i+m-1] - arr[i];
            ans = Math.min(ans, diff);
        }
        return ans;
    }
}
