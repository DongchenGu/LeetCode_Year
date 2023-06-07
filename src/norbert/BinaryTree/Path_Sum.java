package norbert.BinaryTree;

//https://leetcode.com/problems/path-sum/description/
public class Path_Sum {


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




    public boolean hasPathSum(TreeNode root, int targetSum) {
        int pathSum = 0;
        if(root == null){
            return false;
        }
        return getSum(pathSum, root, targetSum);
    }

    public boolean getSum(int pathSum, TreeNode root, int targetSum){
        pathSum += root.val;
        if(root.left==null && root.right==null){
            if(pathSum == targetSum){
                return true;
            }
        }
        if(root.left!=null){
            boolean result1 = getSum(pathSum, root.left,targetSum);
            if(result1 ){
                return true;
            }
        }
        if(root.right!=null){
            boolean result2 =  getSum(pathSum, root.right,targetSum);
            if(result2 == true){
                return true;
            }
        }
        return false;
    }
}
