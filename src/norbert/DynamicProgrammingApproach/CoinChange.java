package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/coin-change/description/
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=0; i<coins.length; i++){
            for(int j=1; j<=amount; j++){
                if(j>=coins[i] && dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j-coins[i]]+1 );
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE){return -1;}
        return dp[amount];
    }
}
