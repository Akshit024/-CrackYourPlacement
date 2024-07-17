package String.Easy;

public class Valid_Parentheses {
    public boolean isValid(String name) {
        Deque<Character> m =new ArrayDeque<>();
        for(int i=0;i<name.length();i++){
            char c =name.charAt(i);
            if(!m.isEmpty()){
                if(c==')' && m.peek()=='('){
                    m.pop();
                }else if(c=='}' && m.peek()=='{'){
                    m.pop();
                }else if(c==']' && m.peek()=='['){
                    m.pop();
                }else{
                    m.push((c));
                }
            }else m.push((c));
        }
        return m.isEmpty();
    }
}
