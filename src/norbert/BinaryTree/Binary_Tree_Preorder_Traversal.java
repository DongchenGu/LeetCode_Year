package norbert.BinaryTree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class Binary_Tree_Preorder_Traversal {


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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root!=null){
            getPreOrderValue(result,root);
        }


        return result;
    }

    public void getPreOrderValue(List<Integer> result, TreeNode root){
        result.add(root.val);
        if(root.left!=null){
            getPreOrderValue(result,root.left);
        }
        if(root.right!=null){
            getPreOrderValue(result,root.right);
        }
    }

    }
