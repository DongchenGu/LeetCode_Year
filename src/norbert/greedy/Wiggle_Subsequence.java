package norbert.greedy;


//https://leetcode.com/problems/wiggle-subsequence/description/
public class Wiggle_Subsequence {

    public int wiggleMaxLength(int[] nums) {

        int result=1;
        int preDiff=0;
        int curDiff=0;
        if(nums.length==1){return 1;}

        for(int i=1; i<nums.length; i++){
            curDiff =nums[i]-nums[i-1];
            if((preDiff==0 && curDiff>0) || (preDiff==0 && curDiff<0)){result++; preDiff = curDiff;}
            if((preDiff<0 && curDiff>0) || preDiff>0 && curDiff<0){result++;preDiff = curDiff;}

        }
        return result;
    }
}
