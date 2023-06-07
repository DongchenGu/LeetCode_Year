package norbert.BinaryTree.Different_Traversal;

import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class Inorder_Traversal_Iteration {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if(root!=null)
        deque.addFirst(root);
        TreeNode temp = new TreeNode();

        while (!deque.isEmpty()){
            temp = deque.removeFirst();
            if(temp.left!=null || temp.right!=null){
                if(temp.right!=null){deque.addFirst(temp.right);}
                deque.addFirst(new TreeNode(temp.val,null,null));
                if(temp.left!=null){deque.addFirst(temp.left);}
            }else{
                result.add(temp.val);
            }
        }

        return result;
    }

}
