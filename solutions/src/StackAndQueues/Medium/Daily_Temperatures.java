package StackAndQueues.Medium;

import java.util.Stack;

class pair{
    int val;
    int hight;
    pair(int val,int hight){
        this.val = val;
        this.hight = hight;
    }
}
public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temp) {
        Stack<pair> stk = new Stack<>();
        int ans[] = new int[temp.length];
        for(int i=temp.length-1;i>=0;i--){
            int len =0;
            while(!stk.isEmpty() && temp[i]>=stk.peek().val){
                len+=stk.peek().hight+1;
                stk.pop();
            }
            if(stk.isEmpty()){
                pair curr = new pair(temp[i],0);
                stk.push(curr);
                ans[i]=0;
            }else{
                pair curr = new pair(temp[i],len);
                stk.push(curr);
                ans[i]=len+1;
            }
        }
        return ans;
    }
}
