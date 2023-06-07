package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class Postorder_Traversal_Recursion {
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

    public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> result = new ArrayList<>();
            getCurrentValInPostOrder(root,result);
            return  result;
    }

    public void getCurrentValInPostOrder(   TreeNode current, ArrayList<Integer> result){
        if(current==null){
            return;
        }
        getCurrentValInPostOrder(current.left,result);
        getCurrentValInPostOrder(current.right,result);
        result.add(current.val);
    }
}
