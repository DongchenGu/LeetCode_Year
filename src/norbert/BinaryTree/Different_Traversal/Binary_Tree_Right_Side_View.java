package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-right-side-view/description/
public class Binary_Tree_Right_Side_View {


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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        int len;
        TreeNode temp;
        while(!queue.isEmpty()){
            len=queue.size();
            List<Integer> level = new ArrayList<>();
            while(len>0){
                temp= queue.poll();
                level.add(temp.val);
                if(temp.left!=null){queue.offer(temp.left);}
                if(temp.right!=null){queue.offer(temp.right);}
                len--;
            }
            result.add(level.get(level.size()-1));
        }
        return result;
    }
}
