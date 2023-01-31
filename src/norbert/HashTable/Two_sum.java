package norbert.HashTable;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/description/

public class Two_sum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> numsMap= new HashMap<>();
        //hashmap的key是无序，不重复的，所以不能直接把nums数组全都导入到numsMap里面
        int[] result= new int[2];

        for(int i =0; i<nums.length; i++){
            int temp = target-nums[i];
            if(numsMap.containsKey(temp) ){
                result[0] = i;
                result[1] = numsMap.get(temp);
            }else{
                numsMap.put(nums[i],i);
            }
        }
        return result;
    }

}
