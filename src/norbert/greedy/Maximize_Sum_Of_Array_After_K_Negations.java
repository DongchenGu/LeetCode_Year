package norbert.greedy;

import java.util.Arrays;

//https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class Maximize_Sum_Of_Array_After_K_Negations {


    public int largestSumAfterKNegations(int[] nums, int k) {
        int result =0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length && k>0; i++){
            if(nums[i]<0){nums[i]=-nums[i];k--;}
        }
        if(k>0 && k%2==1){
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }

        for(int i=0; i<nums.length; i++){
            result+=nums[i];
        }
        return result;
    }
}
