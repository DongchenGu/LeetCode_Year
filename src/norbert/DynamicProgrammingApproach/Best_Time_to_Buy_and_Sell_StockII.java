package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class Best_Time_to_Buy_and_Sell_StockII {

    public int maxProfit(int[] prices) {
        if(prices.length ==1 ) return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for(int i=1; i<prices.length; i++){
            dp[i][0] = Math.max( dp[i-1][0]  , dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max( dp[i-1][1] , dp[i-1][0] + prices[i]);
        }
        return Math.max( dp[prices.length-1][0], dp[prices.length-1][1]);
    }
}
