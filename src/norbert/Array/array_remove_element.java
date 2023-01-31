package norbert.Array;

//https://leetcode.com/problems/remove-element/

public class array_remove_element {
    public static void main(String[] args) {

        int[] array = {12, 2, 34, 56, 6, 56, 56, 345, 56, 3, 4};
        int result = removeElement(array,56);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int left=0,right = 0;
        for (right = 0;right<nums.length; right++){
            if(nums[right]==val){

            }else{
                nums[left]=nums[right];
                left++;
            }
        }

        return left;
    }
}
