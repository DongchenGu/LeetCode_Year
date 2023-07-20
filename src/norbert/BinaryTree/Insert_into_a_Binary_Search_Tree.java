package norbert.BinaryTree;


//https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
public class Insert_into_a_Binary_Search_Tree {


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




    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val, null,null);
        }
        postOrder(root,val);
        return root;
    }

    public void postOrder(TreeNode root, int val){
        if (root.left == null && root.right ==null){
            if(val < root.val){root.left = new TreeNode(val,null,null);}
            if(val > root.val){root.right = new TreeNode(val,null,null);}
            return;
        }
        if(root.left == null && val < root.val){root.left = new TreeNode(val, null,null);}
        if(root.right == null && val > root.val){root.right = new TreeNode(val, null,null);}
        if(val < root.val){postOrder(root.left, val);}
        if(val > root.val){postOrder(root.right, val);}
    }
}
