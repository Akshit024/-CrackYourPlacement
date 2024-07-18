package String.Medium;

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        String ans ="";
        String temp ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp+=s.charAt(i);
            }
            if(s.charAt(i)==' ' && temp.length()>0){
                ans=temp+" "+ans;
                temp="";
            }
            if(i==s.length()-1 && temp.length()>0){
                ans=temp+" "+ans;
            }
        }
        return ans.substring(0,ans.length()-1);
    }
}
