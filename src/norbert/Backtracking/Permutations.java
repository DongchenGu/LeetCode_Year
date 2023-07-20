package norbert.Backtracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/permutations/description/
public class Permutations {

    //第一种做法，使用hashSet 来去重，但这个效率低
//    List<List<Integer>> result = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//
//    HashSet<Integer> hs = new HashSet<>();
//
//    public List<List<Integer>> permute(int[] nums) {
//        backTracking(nums);
//        return result;
//    }
//
//    public void backTracking(int[] nums ){
//        if(path.size()==nums.length){
//            result.add(new ArrayList<Integer>(path));
//            return;
//        }
//
//        for(int i=0; i<nums.length; i++){
//            if(hs.contains(nums[i])){
//                continue;
//            }else{
//                path.add(nums[i]);
//                hs.add(nums[i]);
//                backTracking(nums);
//                path.remove(path.size()-1);
//                hs.remove(nums[i]);
//            }
//        }
//        return;
//    }



    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();



    public List<List<Integer>> permute(int[] nums) {
        int[] hs = new int[nums.length];
        Arrays.fill(hs,0);
        backTracking(nums,hs);
        return result;
    }

    public void backTracking(int[] nums,int[] hs ){
        if(path.size()==nums.length){
            result.add(new ArrayList<Integer>(path));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(hs[i]==1){
                continue;
            }else{
                path.add(nums[i]);
                hs[i]=1;
                backTracking(nums,hs);
                path.remove(path.size()-1);
                hs[i]=0;
            }
        }
        return;
    }
}
