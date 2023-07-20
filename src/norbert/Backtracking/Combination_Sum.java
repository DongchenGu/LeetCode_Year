package norbert.Backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
public class Combination_Sum {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    int sum=0;
    int min = Integer.MAX_VALUE;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for(int item : candidates){
            if(item< min){ min = item;}
        }
        int loop = target/min+1;
        backTracking(candidates,target,loop,0);
        return result;
    }

    public void backTracking(int[] array, int target, int loop,int start){
        if(sum == target){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        if( sum>target){
            return;
        }

        for(int i=start; i<array.length; i++){
            temp.add(array[i]);
            sum+=array[i];
            backTracking(array,target, loop, i);
            sum-=temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }
        return;
    }

}
