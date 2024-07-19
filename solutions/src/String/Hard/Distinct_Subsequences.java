package String.Hard;

public class Distinct_Subsequences {
    int dp[][];
    int find(int i,int j,String s,String t){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int take =0;
        if(s.charAt(i)==t.charAt(j)){
            take = find(i+1,j+1,s,t);
        }
        int nottake = find(i+1,j,s,t);

        return dp[i][j]=take+nottake;
    }
    public int numDistinct(String s, String t) {
        if(t.length()>s.length()) return 0;
        dp=new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++) Arrays.fill(dp[i],-1);
        return find(0,0,s,t);
    }
}
