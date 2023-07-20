package norbert.BinaryTree;



//https://leetcode.com/problems/trim-a-binary-search-tree/description/
public class Trim_a_Binary_Search_Tree {



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




    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return null;
        }
        TreeNode right = root.right;
        TreeNode left = root.left;
        if( root.val < low){
            while(right!=null && right.val < low ){
                right  = right.right;
            }
            if(right == null){return null;}
            else{
                return  trimBST(right, low, high);
            }
        }
        if(root.val >high){
            while(left!=null  && left.val >high ){
                left = left.left;
            }
            if(left == null){return null;}
            else{
                return trimBST(left, low, high);
            }
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
