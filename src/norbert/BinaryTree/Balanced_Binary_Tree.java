package norbert.BinaryTree;

public class Balanced_Binary_Tree {

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

    //递归实现
    public boolean isBalanced(TreeNode root) {
        if(root ==null){
            return true;
        }
        int result = getHeight(root);
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left == -1 || right==-1 || Math.abs(left - right)>1){
            return -1;
        }else{
            int mid = left > right? left+1 : right+1;
            return mid;
        }
    }
}
