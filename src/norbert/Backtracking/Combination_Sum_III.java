package norbert.Backtracking;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/description/
public class Combination_Sum_III {


    //最基本的做法，就会通过回溯的方式，遍历所有的可能性
//    List<List<Integer>> result = new ArrayList<>();
//    List<Integer> item = new ArrayList<>();
//
//    public List<List<Integer>> combinationSum3(int k, int n) {
//        backTracking(1,k, n);
//        return result;
//
//    }
//
//    public void backTracking(int left, int k, int n){
//        if(item.size() == k){
//            Iterator it = item.iterator();
//            Integer sum =0;
//            while(it.hasNext()){
//                sum = sum + (Integer)it.next();
//            }
//            if(sum == n){
//                result.add(new ArrayList<Integer>(item));
//            }
//            return;
//        }
//
//        for(int i=left; i<=9; i++){
//            item.add(i);
//            backTracking(i+1, k,n);
//            item.remove(item.size()-1);
//        }
//
//        return;
//    }

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    int sum =0;

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k,n,1);
        return result;
    }

    public void backTracking(int k, int n, int startIndex){
        if(temp.size()>k ||sum>n ){return;}
        if(temp.size()==k && sum==n){
            result.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i=startIndex; i<=9;i++){
            temp.add(i);
            sum+=i;
            backTracking(k,n,i+1);
            sum-=i;
            temp.remove(temp.size()-1);
        }
        return;
    }

}
