package norbert.Array;

//https://leetcode.com/problems/minimum-size-subarray-sum/
public class Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int result= 0;
        int outputLength = 0;
        for (right = 0;right<nums.length;right++){
            result+=nums[right];
            while (result>=target){
                if(outputLength==0){
                    outputLength= right-left+1;
                }else if(right-left+1<outputLength){
                    outputLength =right-left+1;
                }
                result-=nums[left];
                left++;
            }
        }

        return outputLength;
    }
}
