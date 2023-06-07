package norbert.Stack_Queue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-elements/
public class Top_K_Frequent_Elements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                int temp = hashMap.get(nums[i]);
                temp++;
                hashMap.put(nums[i],temp);
            }else{
                hashMap.put(nums[i],1);
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(new   Comparator<int[]>(){
            public int compare(int[] h1, int[] h2){
                return h1[1] - h2[1];
            }
        });
        for(Integer key : hashMap.keySet()){
            pq.offer(new int[]{key, hashMap.get(key)});
        }
        while(pq.size()>k){
            pq.poll();
        }
        int[] result  = new int[k];
        for(int i =0; i<k; i++){
            result[i] = pq.poll()[0];
        }

        return result;
    }
}
