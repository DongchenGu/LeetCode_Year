package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/unique-paths/description/
public class UniquePaths {

    //for循环是从0开始的
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1){
            return 1;
        }
        int[][] dp = new int[m][n];
        dp[0][0]=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i!=0 || j!=0){
                    dp[i][j]=(i-1<0? 0 : dp[i-1][j])+(j-1<0? 0 : dp[i][j-1]);
                }
            }
        }
        return dp[m-1][n-1];
    }

    //按照从1开始循环
    public int uniquePaths2(int m, int n) {
        if(m==1 && n==1){
            return 1;
        }
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            dp[i][0]=1;
        }
        for(int j=0; j<n; j++){
            dp[0][j]=1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
