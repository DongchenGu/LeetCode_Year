package norbert.BinaryTree;


//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
public class Minimum_Absolute_Difference_in_BST {



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






    TreeNode max;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root ){
        if(root==null){
            return;
        }

        inOrder(root.left);
        if(max!=null){
            int temp = root.val - max.val;
            if(temp < min){
                min = temp;
            }
            max =root;
        }else{
            max = root;
        }
        inOrder(root.right);

    }
}
