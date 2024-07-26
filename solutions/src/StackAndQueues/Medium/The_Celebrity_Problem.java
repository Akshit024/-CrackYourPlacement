package StackAndQueues.Medium;

import java.util.Stack;

public class The_Celebrity_Problem {
    int celebrity(int M[][], int n)
    {
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++) stk.push(i);
        int pos =n;
        while(n>1){
            int i = stk.pop();
            int j = stk.pop();
            if(M[i][j]==1){
                stk.push(j);
            }else{
                stk.push(i);
            }
            n--;
        }

        int ele = stk.pop();
        for(int i=0;i<pos;i++){
            if((i!=ele && M[i][ele]==0 )||(M[ele][i]==1)) return -1;
        }

        return ele;
    }
}
