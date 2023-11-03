package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/unique-paths-ii/
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        dp[0][0] = 1;
        for(int i=0; i<obstacleGrid.length; i++){
            for(int j=0; j<obstacleGrid[0].length; j++){
                if(i!=0 || j!=0)
                    dp[i][j]= (j-1>=0 && obstacleGrid[i][j-1]==0? dp[i][j-1] :0) + (i-1>=0 && obstacleGrid[i-1][j]==0? dp[i-1][j] :0);
            }
        }

        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
