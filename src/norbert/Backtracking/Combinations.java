package norbert.Backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://leetcode.com/problems/combinations/description/
public class Combinations {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> eachItem = new ArrayList<>();
    List<Integer> temp;

    public List<List<Integer>> combine(int n, int k) {
        if(k>n){return null;}
        backTracking(1,n,k);
        return result;
    }

    public void backTracking(int left, int right, int k){
        if(eachItem.size()==k){
            temp = new ArrayList<>();
            Iterator it =  eachItem.iterator();
            while(it.hasNext()){
                temp.add((Integer)it.next());
            }
            result.add(temp);
            return;
        }
        for(int i=left; i<=right; i++){
            eachItem.add(i);
            backTracking(i+1, right,k);
            eachItem.remove(eachItem.size()-1);
        }
        return;

    }



    //剪枝后的优化版本

//    List<List<Integer>> result = new ArrayList<>();
//    List<Integer> item = new ArrayList<>();
//
//    public List<List<Integer>> combine(int n, int k) {
//        backtracking(1,n,k);
//        return result;
//    }
//
//    public void backtracking(int left, int right, int k){
//        if(item.size() == k){
//            List<Integer> temp = new ArrayList<>(item);
//            result.add(temp);
//            return;
//        }
//        //这里是修剪操作
//        if( (right-left+1)<(k-item.size())){
//            return;
//        }
//        for(int i=left; i<=right; i++){
//            item.add(i);
//            backtracking(i+1,right, k);
//            item.remove(item.size()-1);
//        }
//        return;
//    }
}
