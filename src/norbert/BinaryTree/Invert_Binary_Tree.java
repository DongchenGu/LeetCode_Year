package norbert.BinaryTree;

import java.util.ArrayDeque;

//https://leetcode.com/problems/invert-binary-tree/
public class Invert_Binary_Tree {


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


    //递归的方法实现
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }else{
            invert(root);
        }
        return root;
    }
    public void invert(TreeNode root){
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null){
            invert(root.left);
        }
        if(root.right!=null){
            invert((root.right));
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }

    //迭代的方法实现
    public TreeNode invertTree2(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        TreeNode temp = null;
        TreeNode left = null;
        TreeNode right = null;
        if(root == null){
            return root;
        }else{
            deque.addFirst(root);
        }
        while(deque.size()>0){
            temp = deque.removeFirst();
            if(temp.left==null && temp.right==null){

            }else{
                left =temp.left;
                right = temp.right;
                temp.left = right;
                temp.right = left;

                if(right!=null){
                    deque.addFirst(right);
                }
                if(left!=null){
                    deque.addFirst(left);
                }
            }
        }
        return root;
    }

}
