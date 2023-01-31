package norbert.HashTable;

import java.util.*;
import java.util.stream.Stream;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> Set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int i=0;i<nums1.length; i++){
            Set1.add(nums1[i]);
        }
        for(int i=0; i< nums2.length; i++){
            if(Set1.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        //转换为数组
        int [] resulyArray = result.stream().mapToInt(i->i.intValue()).toArray();

        return resulyArray;
    }
}
