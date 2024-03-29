package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {

    public int maxProfit(int[] prices) {
        if(prices.length ==1){return 0;}
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for(int i=1; i<prices.length; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]);
        }

        return Math.max(dp[prices.length-1][0], Math.max(dp[prices.length-1][1], dp[prices.length-1][2]) );
    }


}
