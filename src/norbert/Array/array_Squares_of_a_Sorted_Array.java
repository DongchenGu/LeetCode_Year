package norbert.Array;

import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array
public class array_Squares_of_a_Sorted_Array {
    public static void main(String[] args) {

        int[] array ={-14,-5,-5,3,43,53};
        int[] result = sortedSquares(array);
        for (int j=0;j<result.length;j++){
            System.out.println(result[j]);
        }
    }
    public static  int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left =0;
        int right = nums.length-1;

        for (int i = nums.length-1;i>=0;i--){
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                result[i] = nums[right]*nums[right];
                right--;
            }else {
                result[i] = nums[left]*nums[left];
                left++;
            }
        }
        return result;
    }
}
