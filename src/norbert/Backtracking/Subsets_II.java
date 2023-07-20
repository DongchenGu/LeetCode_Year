package norbert.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/description/
public class Subsets_II {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    boolean flag = true;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTracking(nums,0);
        return result;
    }

    public void backTracking(int[] nums, int start){
        result.add(new ArrayList<Integer>(temp));
        for(int i=start; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1] && flag==true){
                continue;
            }else{
                temp.add(nums[i]);
                flag = false;
                backTracking(nums,i+1);
                flag = true;
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
}
