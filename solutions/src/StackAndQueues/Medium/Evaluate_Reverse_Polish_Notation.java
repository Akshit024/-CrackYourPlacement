package StackAndQueues.Medium;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] t) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<t.length;i++){
            if(t[i].equals("-")){
                int first = stk.pop();
                int second = stk.pop();
                stk.push(second-first);
            }else if(t[i].equals("+")){
                int first = stk.pop();
                int second = stk.pop();
                stk.push(first+second);
            }else if(t[i].equals("/")){
                int first = stk.pop();
                int second = stk.pop();
                stk.push(second/first);
            }else if(t[i].equals("*")){
                int first = stk.pop();
                int second = stk.pop();
                stk.push(first*second);
            }else{
                stk.push(Integer.parseInt(t[i]));
            }
        }
        return stk.pop();
    }
}
