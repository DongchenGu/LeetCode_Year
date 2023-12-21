package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/
public class Best_Time_to_Buy_and_Sell_StockIV {

    public int maxProfit(int k, int[] prices) {
        if(prices.length ==1){return 0;}
        int[][] dp = new int[prices.length][2*k+1];

        for(int j=0; j<=(k*2);j++){
            if(j%2 == 0){
                dp[0][j] = 0;
            }else{
                dp[0][j] =  -prices[0];
            }
        }

        for(int i=1; i<prices.length; i++){
            for(int j=0; j<=(2*k); j++){
                if(j==0){
                    dp[i][j] =  dp[i-1][j];
                    continue;
                }
                if(j%2==1){
                    dp[i][j] =  Math.max( dp[i-1][j], dp[i-1][j-1] - prices[i]);
                }else{
                    dp[i][j] = Math.max( dp[i-1][j], dp[i-1][j-1] + prices[i]);
                }
            }
        }
        return dp[prices.length-1][2*k];
    }
}

