package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/longest-increasing-subsequence/description/
public class Longest_Increasing_Subsequence {

    public int lengthOfLIS(int[] nums) {
        if(nums.length ==1){
            return 1;
        }
        int[] dp = new int[nums.length];
        int result = 0;
        for(int i=0; i<dp.length; i++){
            dp[i] = 1;
        }

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]> nums[j]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
                result = Math.max(result, dp[i]);
            }
        }

        return result;
    }
}
