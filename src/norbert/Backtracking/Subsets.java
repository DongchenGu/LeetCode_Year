package norbert.Backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/
public class Subsets {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    public void backTracking(int[] nums, int start){
        result.add(new ArrayList<Integer>(temp));

        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            backTracking(nums,i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }
}
