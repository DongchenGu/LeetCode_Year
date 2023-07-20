package norbert.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/non-decreasing-subsequences/description/
public class Non_decreasing_Subsequences {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();


    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums,0);
        return result;
    }

    public void backTracking(int[] nums, int start){
        if(path.size()>=2){
            result.add(new ArrayList<Integer>(path));
        }
        HashSet<Integer> used = new HashSet<>();

        for(int i=start; i<nums.length; i++){
            if(used.contains(nums[i])){
                continue;
            }
            if(path.size()>0 && nums[i] < path.get(path.size()-1) ){
                continue;
            }
            path.add(nums[i]);
            used.add(nums[i]);
            backTracking(nums,i+1);
            path.remove(path.size()-1);

        }
        return;
    }

}
