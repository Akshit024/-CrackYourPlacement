package StackAndQueues.Medium;

import java.util.Stack;

class Pair{
    int count;
    char c;

    Pair(int count,char c ){
        this.c = c;
        this.count = count;
    }
}
class Remove_All_Adjacent_Duplicates_in_String_lI {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(stk.isEmpty() || stk.peek().c != c){
                stk.push(new Pair(1,c));
            }else{
                Pair p = stk.pop();
                p.count++;
                stk.push(p);
            }

            if(stk.peek().count == k){
                stk.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stk.isEmpty()){
            int count = stk.peek().count;
            char c = stk.peek().c;
            stk.pop();

            while(count > 0){
                sb.append(c);
                count--;
            }
        }

        sb.reverse();
        return sb.toString();
    }
}