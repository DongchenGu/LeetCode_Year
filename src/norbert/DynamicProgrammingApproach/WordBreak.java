package norbert.DynamicProgrammingApproach;

import java.util.List;

//https://leetcode.com/problems/word-break/description/
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()+1];
        for(int i=0; i<dp.length; i++){
            dp[i]=false;
        }
        dp[0] = true;

        for(int j=1; j<dp.length; j++){
            for(String item: wordDict){
                if(j >= item.length() && dp[j-item.length()]==true
                        && s.substring(j-item.length(),j).equals(item)){
                    dp[j] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
