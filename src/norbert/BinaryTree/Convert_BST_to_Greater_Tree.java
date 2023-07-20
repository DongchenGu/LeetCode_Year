package norbert.BinaryTree;


//https://leetcode.com/problems/convert-bst-to-greater-tree/description/
public class Convert_BST_to_Greater_Tree {


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




    int pre =0;
    public TreeNode convertBST(TreeNode root) {
        return customizedTraverse(root);
    }

    public TreeNode customizedTraverse(TreeNode root){
        if(root == null){
            return null;
        }

        root.right= customizedTraverse(root.right);
        root.val = root.val + pre;
        pre = root.val;
        root.left = customizedTraverse(root.left);

        return root;
    }
}
