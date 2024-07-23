package StackAndQueues.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stk1 = new ArrayDeque<>();
        Deque<Character> stk2 = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='#'){ if(!stk1.isEmpty()) stk1.pop();
            }
            else stk1.push(c);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#'){ if(!stk2.isEmpty()) stk2.pop();
            }
            else stk2.push(c);
        }

        while(!stk1.isEmpty() && !stk2.isEmpty() && stk1.peek().equals(stk2.peek())){
            stk1.pop();
            stk2.pop();
        }

        return stk1.isEmpty() && stk2.isEmpty();
    }
}
