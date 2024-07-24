package StackAndQueues.Medium;
import java.util.*;

public class Minimum_Cost_Tree_From_Leaf_Values {
    int find(int left,int right,int[][] map,int[] arr,int dp[][]){
        if(left==right) return 0;

        if(dp[left][right]!=-1) return dp[left][right];
        int ans = Integer.MAX_VALUE;
        for(int i=left;i<right;i++){
            ans = Math.min(ans,map[left][i]*map[i+1][right] + find(left,i,map,arr,dp) + find(i+1,right,map,arr,dp));
        }
        return dp[left][right] = ans;
    }
    public int mctFromLeafValues(int[] arr) {
        int map[][] = new int[arr.length][arr.length];
        int dp[][] = new int[arr.length+1][arr.length+1];
        for(int i=0;i<arr.length;i++){
            map[i][i]=arr[i];
            for(int j=i+1;j<arr.length;j++){
                map[i][j] = Math.max(arr[j],map[i][j-1]);
            }
        }

        for(int i=0;i<=arr.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return find(0,arr.length-1,map,arr,dp);
    }
}


