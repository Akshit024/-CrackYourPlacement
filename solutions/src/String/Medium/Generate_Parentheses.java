package String.Medium;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    void gethelp(int r,int l,String s,List<String> ans,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }

        if(r<n) gethelp(r+1,l,s+"(",ans,n);
        if(r>l) gethelp(r,l+1,s+")",ans,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gethelp(0,0,"",ans,n);
        return ans;
    }
}
