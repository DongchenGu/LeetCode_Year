package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

////https://leetcode.com/problems/binary-tree-postorder-traversal/
public class Postorder_Traversal_Iteration {

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
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode temp= null;
        if(root!=null)
        deque.addFirst(root);

        while (!deque.isEmpty()){
            temp = deque.removeFirst();
            if(temp.left==null && temp.right ==null){
                result.add(temp.val);
                continue;
            }
            deque.addFirst(new TreeNode(temp.val, null,null));
            if(temp.right!=null){deque.addFirst(temp.right);}
            if(temp.left!=null){deque.addFirst(temp.left);}
        }
        return  result;
    }
}
