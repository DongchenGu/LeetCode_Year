package norbert.greedy;

//https://leetcode.com/problems/maximum-subarray/description/
public class Maximum_Subarray {

    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0;i<nums.length; i++){
            sum+=nums[i];
            if(sum > result){result = sum;}
            if(sum < 0){sum=0; continue;}
        }
        return result;

    }
}
