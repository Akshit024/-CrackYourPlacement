package String.Hard;
import java.util.*;

public class Word_Wrap {
    int dp[][];
    int find(int i,int space,int k,int nums[]){
        if(i==nums.length) return 0;

        if(dp[i][space] != -1) return dp[i][space];

        int ans = Integer.MAX_VALUE;
        int new_space = space + 1 + nums[i];
        if(new_space <= k){
            ans = find(i+1,new_space,k,nums);
        }
        ans = Math.min(ans,(k-space)*(k-space) + find(i+1,nums[i],k,nums));
        return dp[i][space] = ans;
    }
    public int solveWordWrap (int[] nums, int k)
    {

        dp = new int[nums.length][k+1];

        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return find(1,nums[0],k,nums);
    }
}
