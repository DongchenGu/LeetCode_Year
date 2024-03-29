package norbert.BinaryTree;

//https://leetcode.com/problems/merge-two-binary-trees/description/
public class Merge_Two_Binary_Trees {


     // Definition for a binary tree node.
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


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    //创建一个新对象的方式
    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }

        TreeNode newRoot  = new TreeNode(root1.val+root2.val,null,null);
        newRoot.left = mergeTrees(root1.left, root2.left);
        newRoot.right = mergeTrees(root1.right, root2.right);
        return newRoot;
    }
}
