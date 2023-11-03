package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/partition-equal-subset-sum/description/
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        if(sum%2==1){return false;}
        int MaxPackage = sum/2;
        int[][] dp = new int[nums.length][MaxPackage+1];
        for(int i=0;i<nums.length; i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=MaxPackage; i++){
            dp[0][i]=0;
        }
        for(int i=1; i<nums.length; i++ ){
            for(int j =1; j<=MaxPackage; j++){
                if(j>=nums[i]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i]]+nums[i]);}
                else{dp[i][j]=dp[i-1][j];}
            }
        }
        for(int i=0; i<nums.length; i++){
            if(dp[i][MaxPackage]==MaxPackage){
                return true;
            }
        }
        return false;
    }
}
