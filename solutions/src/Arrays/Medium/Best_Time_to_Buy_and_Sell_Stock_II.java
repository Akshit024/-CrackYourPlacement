package Arrays.Medium;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int profit = 0;
        int min = prices[0];

        for (int n : prices) {
            if (min > n) {
                min = n;
            } else if (min < n) {
                profit += n - min;
                min = n;
            }
        }
        return profit;
    }
}
