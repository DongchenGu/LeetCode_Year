package norbert.BinaryTree;


//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
public class Lowest_Common_Ancestor_of_a_Binary_Tree {


      //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = postOrder(root, p, q);
        return result;
    }


    public TreeNode postOrder(TreeNode root, TreeNode p, TreeNode q){
        if(root == p || root == q || root == null){
            return root;
        }

        TreeNode left = postOrder(root.left, p, q);
        TreeNode right = postOrder(root.right, p, q);

        if(left!=null && right !=null){return root;}
        else if(left!=null){
            return left;
        }
        else if(right!=null){
            return right;
        }else{
            return null;
        }

    }
}
