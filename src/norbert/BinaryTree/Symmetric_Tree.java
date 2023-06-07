package norbert.BinaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;

//https://leetcode.com/problems/symmetric-tree/
public class Symmetric_Tree {

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


    //正常迭代法
    public boolean isSymmetric2(TreeNode root) {
        LinkedList<TreeNode> deque = new LinkedList<>();
        TreeNode left = null;
        TreeNode right =null;
        if(root==null){
            return true;
        }else{
            left = root.left;
            right = root.right;
            deque.addFirst(left);
            deque.addFirst(right);
        }

        while(deque.size()>0){
            left = deque.removeFirst();
            right = deque.removeFirst();
            if(left == null && right ==null){
                continue;
            }
            if(left ==null || right ==null || left.val != right.val){
                return false;
            }
            deque.addFirst(left.left);
            deque.addFirst(right.right);
            deque.addFirst(left.right);
            deque.addFirst(right.left);
        }
        return true;
    }


    //傻瓜迭代法：
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = null;
        TreeNode right = null;
        if(root == null){
            return true;
        }else{
            left = root.left;
            right = root.right;
        }
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        if(left ==null && right==null){
            return true;
        }else{
            if(left==null || right == null){
                return false;
            }
            deque.addFirst(left);
            deque.addFirst(right);
        }

        while(deque.size()>0){
            left = deque.removeFirst();
            right = deque.removeFirst();

            if(left.val != right.val){
                return false;
            }
            if(left.left==null && right.right==null){
            }else{
                if(left.left==null || right.right==null){
                    return false;
                }
                deque.addFirst(left.left);
                deque.addFirst(right.right);
            }

            if(left.right == null && right.left==null){
            }else{
                if(left.right==null || right.left==null){
                    return false;
                }
                deque.addFirst(left.right);
                deque.addFirst(right.left);
            }
        }
        return true;
    }



}
