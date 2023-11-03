package norbert.greedy;


//https://leetcode.com/problems/wiggle-subsequence/description/
public class Wiggle_Subsequence {

    public int wiggleMaxLength(int[] nums) {

        if(nums.length==1 ){return 1;}
        int pre = 0;
        int result =1;

        for(int i=1; i<nums.length; i++){
            int cur = nums[i] - nums[i-1];
            if(pre <=0 && cur>0 || pre>=0 && cur<0){
                result++;
                pre = cur;
            }
            //注意： 上面条件里的=0是为了照顾最开始的那个pre
            //这里如果不满足  上面的条件，不能将pre 置为 cur, 否则会造成\_\这种连续下坡
        }
        return result;
    }
}
