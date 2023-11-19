package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/perfect-squares/
public class PerfectSquares {

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] =0;
        for(int i=1; i*i<=n; i++){
            for(int j=0; j<=n; j++){
                if(j>=(i*i) && dp[j-(i*i)]!=Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j] ,  dp[j - (i*i)]+1);
            }
        }

        return dp[n];
    }
}
