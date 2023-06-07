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

//使用while循环来写
    public int minSubArrayLen2(int target, int[] nums) {
        int maxLength =0;
        int left =0;
        int right=0;
        int sum=nums[0];

        while(right<=nums.length-1){
            if(sum<target){
                right++;
                if(right<=nums.length-1)
                    sum+=nums[right];
            }else{
                if(maxLength==0 || maxLength>(right-left+1)){
                    maxLength = right-left+1;
                }
                sum-= nums[left];
                left++;
            }
        }
        return maxLength;
    }
}
