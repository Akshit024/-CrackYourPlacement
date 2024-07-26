package StackAndQueues.Hard;

import java.util.Stack;

public class Maximum_of_minimum_for_every_window_size {
    static int[] maxOfMin(int[] arr, int n)
    {
        // Your code here
        int left[] = new int[n];
        int right[] = new int[n];
        int count[] = new int[n];

        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                left[i]=i+1;
            }
            else{
                left[i] = i-stk.peek();
            }
            stk.push(i);
        }

        stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                right[i]=n-i-1;
            }
            else{
                right[i] = stk.peek()-i-1;
            }
            stk.push(i);
        }

        for(int i=0;i<n;i++){
            int total = left[i]+right[i] - 1;
            count[total] = Math.max(count[total],arr[i]);
        }

        int max =0;

        for(int i=n-1;i>=0;i--){
            max = Math.max(max,count[i]);
            count[i] = max;
        }

        return count;
    }
}
