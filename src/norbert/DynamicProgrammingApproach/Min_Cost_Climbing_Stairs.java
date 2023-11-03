package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/min-cost-climbing-stairs/description/
public class Min_Cost_Climbing_Stairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;

        if(cost.length==2){
            int result = cost[0]<cost[1]? cost[0] : cost[1];
            return result;
        }
        for(int i=2; i<=cost.length; i++){
            dp[i] = dp[i-1]+cost[i-1]<dp[i-2]+cost[i-2]? dp[i-1]+cost[i-1] : dp[i-2]+cost[i-2];
        }
        return dp[cost.length];
    }
}
