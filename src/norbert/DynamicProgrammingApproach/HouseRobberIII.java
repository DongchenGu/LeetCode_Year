package norbert.DynamicProgrammingApproach;

//https://leetcode.com/problems/house-robber-iii/description/
public class HouseRobberIII {

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


    public int rob(TreeNode root) {
        int[] rootDP = postOrder(root);
        return Math.max(rootDP[0], rootDP[1]);
    }

    public int[] postOrder(TreeNode root){
        int[] nodeDP = new int[2];
        if(root == null){
            return nodeDP;
        }
        int[] left = postOrder(root.left);
        int[] right = postOrder(root.right);

        nodeDP[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        nodeDP[1] = root.val + left[0] + right[0];
        return nodeDP;
    }
}
