package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {


    //方法1：得到整个DP序列
    public int climbStairs(int n) {
        if(n==1){return 1;}
        if(n==2){return 2;}
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    //方法2: 只迭代两个DP数值
    public int climbStairs2(int n) {
        if(n==1){return 1;}
        if(n==2){return 2;}
        int[] dp = new int[3];
        dp[1]=1;
        dp[2]=2;
        int sum =0;
        for(int i=3; i<=n; i++){
            sum = dp[1]+dp[2];
            dp[1]=dp[2];
            dp[2] = sum;
        }
        return sum;
    }
}
