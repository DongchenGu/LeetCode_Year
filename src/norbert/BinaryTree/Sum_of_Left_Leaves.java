package norbert.BinaryTree;

import java.util.ArrayDeque;

//https://leetcode.com/problems/sum-of-left-leaves/description/
public class Sum_of_Left_Leaves {


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



    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        TreeNode temp ;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if (root ==null){
            return result;
        }else{
            deque.addFirst(root);
        }

        while(deque.size()>0){
            temp = deque.removeFirst();
            if(temp.left!=null && temp.left.left==null && temp.left.right == null){
                result+=temp.left.val;
            }
            if(temp.right!=null){
                deque.addFirst(temp.right);
            }
            if(temp.left !=null){
                deque.addFirst(temp.left);
            }

        }
        return result;
    }
}
