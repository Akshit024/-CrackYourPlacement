public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] p) {
        int ans =0;
        int ele =p[0];
        for(int i=1;i<p.length;i++){
            ans = Math.max(ans,p[i]-ele);
            ele = Math.min(ele,p[i]);
        }

        return ans;
    }
}
