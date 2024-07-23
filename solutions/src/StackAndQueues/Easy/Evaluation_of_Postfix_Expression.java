package StackAndQueues.Easy;
import java.util.*;

public class Evaluation_of_Postfix_Expression {
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> sk = new Stack<>();
        for(int i=0;i<S.length();i++){
            int n =S.charAt(i)-'0';
            if(n>=0 && n<=9){
                sk.push(n);
            }else{
                int second =sk.pop();
                int first =sk.pop();
                float ans =0;
                char c=S.charAt(i);
                switch(c){
                    case '*': ans=second*first;
                        break;
                    case '/':ans=first/second;
                        break;
                    case '-':ans=first-second;
                        break;
                    case '+':ans=first+second;
                }
                sk.push((int)(ans));
            }
        }
        return sk.pop();
        // Your code here
    }
}
