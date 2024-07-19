package String.Medium;
import java.util.*;
public class Basic_Calculator_II {
    StringBuilder make(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }

        return sb;
    }
    public int calculate(String S) {
        StringBuilder s = make(S);
        Stack<Integer> stk = new Stack<>();
        int prev = -1;
        int i=0;
        int n = s.length();
        while(i<n){
            char c = s.charAt(i);
            if(c >='0' && c<='9'){
                int num =0;
                while(i<n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                stk.push(num);
            }
            else{
                if(c == '+' || c=='-'){
                    if(prev != -1){
                        int top2 = stk.pop();
                        int top1 = stk.pop();
                        if(prev == 1){
                            stk.push(top1+top2);
                        }else{
                            stk.push(top1-top2);
                        }
                    }
                    if(c == '+'){
                        prev = 1;
                    }else{
                        prev = 2;
                    }
                    i++;
                }
                else{
                    i++;
                    int next =0;
                    while(i<n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                        next = next*10 + (s.charAt(i)-'0');
                        i++;
                    }
                    stk.push(next);

                    int top2 = stk.pop();
                    int top1 = stk.pop();
                    if(c == '*'){
                        stk.push(top1*top2);
                    }else{
                        stk.push(top1/top2);
                    }
                }
            }
        }

        if(prev != -1){
            int top2 = stk.pop();
            int top1 = stk.pop();
            if(prev == 1){
                stk.push(top1+top2);
            }else{
                stk.push(top1-top2);
            }
        }

        return stk.peek();
    }
}
