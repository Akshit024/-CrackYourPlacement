package Mathematical.Easy;

public class Excel_Sheet_Column_Title {
    public String convertToTitle(int cn) {
        String ans ="";
        while(cn>0){
            int n = cn%26;
            char c=(char)(n+'A'-1);
            if(n==0){
                ans="Z"+ans;
                cn--;
            }
            else ans=c+ans;
            cn=cn/26;
        }
        return ans;
    }
}
