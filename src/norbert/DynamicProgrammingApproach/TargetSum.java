package norbert.DynamicProgrammingApproach;

import java.util.Arrays;

//https://leetcode.com/problems/target-sum/description/
public class TargetSum {

    public static  int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        if(sum < Math.abs(target)){return 0;}
        if((sum + target)%2 == 1){return 0;};

        int MaxPackage = (sum + target)/2;
        int[][] dp = new int[nums.length][MaxPackage+1];

        int zeroNum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroNum++;
            }
            if(zeroNum >0){ dp[i][0] =(int) Math.pow(2,zeroNum);}
            else{dp[i][0]=1;}
        }
        for(int i=1; i<=MaxPackage; i++){
            if(nums[0]==i){dp[0][i]=1;}
        }


        for(int i=1; i<nums.length; i++){
            for(int j=1; j<=MaxPackage; j++){
                if(j>=nums[i]){
                    dp[i][j] = dp[i-1][j] +  dp[i-1][j-nums[i]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int i=0; i<dp.length; i++){
            for (int j=0; j< dp[0].length; j++){
                System.out.print(dp[i][j]);
            }
            System.out.println("/n");
        }

        return dp[0][1];
    }

    public static void main(String[] args){
         int[] arg = new int[]{1,1,1,1,1};
         int result = findTargetSumWays(arg, 3);
         System.out.println(result);
    }


    //一维DP数组的方式
    public int findTargetSumWays2(int[] nums, int target) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        //如果target过大 sum将无法满足
        if ( target > sum || target<-sum ) return 0;
        if ((target + sum) % 2 != 0) return 0;

        int backpack = (sum + target)/2;
        int[] dp = new int[backpack+1];
        dp[0] =1;
        for(int i=0; i<nums.length; i++){
            for(int j =backpack; j>=nums[i]; j--){
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[backpack];
    }
}
