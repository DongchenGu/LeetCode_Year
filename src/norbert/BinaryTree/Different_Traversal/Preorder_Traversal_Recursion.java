package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class Preorder_Traversal_Recursion {


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
          ArrayList<Integer> result = new ArrayList<>();
          this.getCurrentValInPreOrder(root,result );
          return result;
    }

    public void getCurrentValInPreOrder(TreeNode current, ArrayList<Integer> result){
          if(current==null){
              return;
          }
          result.add(current.val);
          getCurrentValInPreOrder(current.left,result);
          getCurrentValInPreOrder(current.right,result);
    }

    }
