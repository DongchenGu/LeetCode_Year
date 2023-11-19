package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/house-robber-ii/description/
public class HouseRobberII {

    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        int left = robRange(nums,0,nums.length-2);
        int right = robRange(nums,1,nums.length-1);
        return Math.max(left, right);
    }

    public int robRange(int[] nums, int start, int end ){
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);
        for(int j=start+2; j<=end; j++){
            dp[j] = Math.max( dp[j-1], dp[j-2]+nums[j]);
        }
        return dp[end];
    }
}
