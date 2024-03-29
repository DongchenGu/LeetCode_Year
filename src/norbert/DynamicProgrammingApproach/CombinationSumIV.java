package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/combination-sum-iv/
public class CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] =1;

        for(int i=0; i<nums.length; i++){
            for(int j =0; j<=target; j++){
                if(j>=nums[i])
                    dp[j] += dp[j-nums[i]];
            }
        }

        return dp[target];
    }
}
