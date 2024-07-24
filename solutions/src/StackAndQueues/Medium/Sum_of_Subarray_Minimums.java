package StackAndQueues.Medium;

import java.util.Stack;

public class Sum_of_Subarray_Minimums {
    public int sumSubarrayMins(int[] arr) {
        Stack<int[]> stk = new Stack<>();
        long ans =0;
        int mod = 1000000007;
        int n = arr.length;
        long sum =0;
        for(int i=0;i<n;i++){
            int curr[] = new int[2];
            curr[0]=arr[i];
            curr[1]=1;

            while(!stk.isEmpty() && stk.peek()[0] >= arr[i]){
                int temp[] = stk.pop();
                sum = sum-temp[0]*temp[1];
                curr[1]+=temp[1];
            }
            stk.push(curr);
            sum = (sum + curr[0]*curr[1])%mod;
            ans = (ans + sum%mod)%mod;
        }
        return (int)ans;
    }
}
