package norbert.HashTable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class Three_Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                return result;
            }
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                int temp = nums[i]+nums[left]+nums[right];
                if(temp>0){
                    right--;
                    continue;
                }else if(temp<0){
                    left++;
                    continue;
                }else{
                    ArrayList<Integer> tempArray = new ArrayList<>();
                    tempArray.add(nums[i]);
                    tempArray.add(nums[left]);
                    tempArray.add(nums[right]);
                    result.add(tempArray);
                    left++;
                    while (nums[left]==nums[left-1] && left<right){
                        left++;
                    }
                    right--;
                    while (nums[right]==nums[right+1] && left<right){
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
