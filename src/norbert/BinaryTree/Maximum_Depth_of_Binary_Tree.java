package norbert.BinaryTree;

import java.util.ArrayDeque;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Maximum_Depth_of_Binary_Tree {


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

    //层次遍历法获得
    public int maxDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        TreeNode temp = null;
        int maxlength = 0;
        int length = 0;
        if(root == null){
            return length;
        }else{
            deque.addLast(root);
        }

        while(deque.size()>0){
            length = deque.size();
            while(length>0){
                temp =deque.removeFirst();
                length--;
                if(temp.left!=null){
                    deque.addLast(temp.left);
                }
                if(temp.right!=null){
                    deque.addLast(temp.right);
                }
            }
            maxlength++;
        }
        return maxlength;
    }

    //递归的方式获得
    public int maxDepth2(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        if(left > right){
            return left+1;
        }else{
            return right +1;
        }
    }
}
