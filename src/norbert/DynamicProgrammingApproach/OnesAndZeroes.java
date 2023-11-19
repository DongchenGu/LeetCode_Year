package norbert.DynamicProgrammingApproach;


//https://leetcode.com/problems/ones-and-zeroes/description/
public class OnesAndZeroes {

    public int findMaxForm(String[] strs, int m, int n) {

        if(strs.length==0){return 0;}
        int[][] dp = new int[m+1][n+1];
        dp[0][0]= 0;
        for (String str : strs) {
            int x = 0;
            int y = 0;
            for (int num = 0; num < str.length(); num++) {
                if (str.charAt(num) == '0') {
                    x++;
                } else {
                    y++;
                }
            }
            for (int i = m; i >= x; i--) {
                for (int j = n; j >= y; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - x][j - y] + 1);
                }
            }
        }

        return dp[m][n];
    }
}
