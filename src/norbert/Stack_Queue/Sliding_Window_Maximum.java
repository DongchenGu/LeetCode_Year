package norbert.Stack_Queue;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class Sliding_Window_Maximum {
    //这个方法会超时，错误
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();

        Deque<Integer> window = new ArrayDeque<>();
        List<Integer>  sortedArray = new ArrayList<>();

        int max=nums[0];
        for(int i =0; i<nums.length; i++){
            if(window.isEmpty() || window.size()<k){
                window.addLast(nums[i]);
                sortedArray.add(nums[i]);
            }else{
                Collections.sort(sortedArray);
                result.add(sortedArray.get(sortedArray.size()-1));

                sortedArray.remove(window.removeFirst());
                window.addLast(nums[i]);
                sortedArray.add(nums[i]);
            }
        }
        Collections.sort(sortedArray);
        result.add(sortedArray.get(sortedArray.size()-1));

        return result.stream().mapToInt(i->i).toArray();
    }



}
