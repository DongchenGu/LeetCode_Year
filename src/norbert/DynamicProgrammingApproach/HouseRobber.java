package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/house-robber/description/
public class HouseRobber {


    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        if(nums.length==2){return Math.max(nums[0], nums[1]); }
        int[] dp =  new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int j=2; j<nums.length; j++){
            dp[j] = Math.max(dp[j-1], dp[j-2]+nums[j]);
        }
        return dp[nums.length-1];
    }
}
