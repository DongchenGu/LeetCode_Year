package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/last-stone-weight-ii/description/
public class LastStoneWeightII {

    public int lastStoneWeightII(int[] stones) {
        int sum =0;
        for(int i=0; i< stones.length; i++){
            sum+=stones[i];
        }
        int packageMax = sum/2;

        int[][]dp = new int[stones.length][packageMax+1];
        for(int i=0; i<stones.length; i++){
            dp[i][0] =0;
        }
        for(int i=0; i<=packageMax; i++){
            if( i>= stones[0]){
                dp[0][i]=stones[0];
            }else{dp[0][i]=0;}
        }
        for(int i=1; i< stones.length; i++){
            for(int j=1; j<=packageMax; j++){
                if(j>=stones[i]){
                    dp[i][j]= Math.max(dp[i-1][j], dp[i-1][j-stones[i]]+ stones[i]);}
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        int packageLarge = 0;
        for(int i=0; i< stones.length; i++){
            if(dp[i][packageMax]  > packageLarge)
                packageLarge = dp[i][packageMax];
        }
        return sum - 2*packageLarge;
    }
}
