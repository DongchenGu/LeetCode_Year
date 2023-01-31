package norbert.Array;

//https://leetcode.com/problems/binary-search/description/
public class Binary_search {

    public int search(int[] nums, int target) {
        int lower =0;
        int higher = nums.length-1;
        int middle = (lower+higher)/2;
        while(lower<=higher){
            if(target>nums[middle]){
                lower = middle+1;
            }else if(target<nums[middle]){
                higher=middle-1;
            }else {
                return middle;
            }
            middle= (lower+higher)/2;
        }
        return -1;
    }
}
