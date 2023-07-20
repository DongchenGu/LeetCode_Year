package norbert.BinaryTree;

import java.util.ArrayList;

//https://leetcode.com/problems/maximum-binary-tree/description/
public class Maximum_Binary_Tree {


    //  Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }




    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==1){
            return new TreeNode(nums[0]);
        }

        int max = 0;
        int maxIndex =0;
        int index =0;
        while(index <nums.length){
            if(nums[index] >max){
                max = nums[index];
                maxIndex = index;
            }
            index++;
        }
        TreeNode root = new TreeNode(max, null, null);
        if(maxIndex >0){
            ArrayList<Integer> array = new ArrayList<>();
            for(int i =0; i<maxIndex; i++){
                array.add(nums[i]);
            }
            root.left = constructMaximumBinaryTree(array.stream().mapToInt(Integer::intValue).toArray());
        }
        if(maxIndex < nums.length-1){
            ArrayList<Integer> array = new ArrayList<>();
            for(int i =maxIndex+1; i<nums.length; i++){
                array.add(nums[i]);
            }
            root.right=constructMaximumBinaryTree(array.stream().mapToInt(Integer::intValue).toArray());
        }
        return root;
    }
}
