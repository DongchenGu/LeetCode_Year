package norbert.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/description/
public class Combination_Sum_II {
    List<List<Integer>> result  = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    int sum =0;


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        Arrays.fill(used,false);
        Arrays.sort(candidates);
        backTracking(candidates, 0,target, used);
        return result;
    }

    public void backTracking(int[] list , int startIndex, int target,boolean[] used){
        if( sum == target){
            result.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i=startIndex; i<list.length; i++){
            if(sum + list[i] > target){break;}
            if(i!=0 && list[i] == list[i-1] && used[i-1]==false){
                continue;
            }else{
                temp.add(list[i]);
                sum+=list[i];
                used[i]=true;
                backTracking(list, i+1,target,used);
                sum-=list[i];
                used[i]=false;
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
}
