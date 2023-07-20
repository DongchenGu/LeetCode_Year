package norbert.Backtracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/permutations-ii/description/
public class Permutations_II {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();


    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] pathUsed = new int[nums.length];
        Arrays.fill(pathUsed, 0);
        backTracking(nums, pathUsed);

        return result;
    }

    public void backTracking(int[] nums, int[] pathUsed){
        if(path.size() == nums.length){
            result.add(new ArrayList<Integer>(path));
            return;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i]) || pathUsed[i]==1){
                continue;
            }else{
                path.add(nums[i]);
                pathUsed[i]=1;
                hs.add(nums[i]);
                backTracking(nums, pathUsed);
                pathUsed[i] =0;
                path.remove(path.size()-1);
            }
        }
        return;
    }
}
