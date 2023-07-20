package norbert.BinaryTree;


//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class Convert_Sorted_Array_to_Binary_Search_Tree {


      //Definition for a binary tree node.
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


    public TreeNode sortedArrayToBST(int[] nums) {
        return inOrderTraverse(nums, 0, nums.length -1);
    }

    public TreeNode inOrderTraverse(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid], null, null);
        root.left = inOrderTraverse(nums,left, mid-1);
        root.right = inOrderTraverse(nums, mid+1, right);

        return root;
    }
}
