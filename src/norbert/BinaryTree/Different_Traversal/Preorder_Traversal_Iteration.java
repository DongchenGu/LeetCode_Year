package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
//使用迭代的方式实现二叉树遍历，前序遍历
public class Preorder_Traversal_Iteration {

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
        Deque<TreeNode> deque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        if(root!=null){
            deque.addFirst(root);
        }


        while (!deque.isEmpty()){
            TreeNode temp = deque.removeFirst();
            result.add(temp.val);
            if(temp.right!=null){
                deque.addFirst(temp.right);
            }
            if(temp.left!=null){
                deque.addFirst(temp.left);
            }
        }
        return  result;
    }


}
