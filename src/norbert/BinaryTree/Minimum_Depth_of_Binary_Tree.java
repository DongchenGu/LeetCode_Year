package norbert.BinaryTree;


import java.util.ArrayDeque;


//https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
public class Minimum_Depth_of_Binary_Tree {

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



    public int minDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int depth = 0;
        TreeNode temp = null;
        if(root == null){
            return 0;
        }else{
            deque.addLast(root);
        }
        while(deque.size()>0){
            int length =deque.size();
            depth++;
            while( length>0 ){
                temp = deque.removeFirst();
                length--;
                if(temp.left == null && temp.right == null){
                    return depth;
                }
                if(temp.left !=null){
                    deque.addLast(temp.left);
                }
                if(temp.right !=null){
                    deque.addLast(temp.right);
                }
            }
        }
        return depth;
    }
}
