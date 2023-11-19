package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/coin-change-ii/description/
public class CoinChangeII {
    public static void main(String[] args) {

    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0; i<=amount; i++){
            if(i%coins[0]==0){dp[0][i]=1;}
            else{dp[0][i]=0;}
        }
        for(int i=0; i<coins.length; i++){
            dp[i][0]=1;
        }

        for(int i=1; i<coins.length; i++){
            for(int j=1; j<=amount; j++){
                for(int n=0; n*coins[i]<=j; n++){
                    dp[i][j] = dp[i][j] + dp[i-1][j- n*coins[i]];
                }
            }
        }

        return dp[coins.length - 1][amount];
    }
}
