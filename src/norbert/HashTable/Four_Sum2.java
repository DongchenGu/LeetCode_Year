package norbert.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/4sum-ii/
public class Four_Sum2 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //直接暴力写就是n^4，我们可以缩减为n^2，我们先遍历出前两个数组有多少种组合，
        //把每种组合加在一起的和作为Map的key,value里存这种组合出现的次数，然后再遍历后面两个数组
        HashMap<Integer, Integer> A = new HashMap<>();
        HashMap<Integer, Integer> B = new HashMap<>();
        int resultCount = 0;

        for(int i=0;i<nums1.length;i++){
         for(int j=0; j<nums2.length;j++){
             int sumTemp = nums1[i]+nums2[j];
             if(!A.containsKey(sumTemp)){
                 A.put(sumTemp,1);
             }else{
                 int temp = A.get(sumTemp);
                 temp++;
                 A.put(sumTemp,temp);
             }
         }
        }

        for(int i=0;i<nums3.length;i++){
            for(int j=0; j<nums4.length;j++){
                int sumTemp = nums3[i]+nums4[j];
                if(A.containsKey(-sumTemp)){
                    resultCount = resultCount +A.get(-sumTemp);
                }
            }
        }

        return resultCount;
    }
}
