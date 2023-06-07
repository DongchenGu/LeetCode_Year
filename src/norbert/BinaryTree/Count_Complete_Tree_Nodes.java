package norbert.BinaryTree;

import java.util.ArrayDeque;

//https://leetcode.com/problems/count-complete-tree-nodes/description/
public class Count_Complete_Tree_Nodes {


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


    //递归的方案
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left+right+1;
    }

    //迭代的方案
    public int countNodes2(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int nodeCount = 0;
        TreeNode temp = null;
        if(root == null){
            return nodeCount;
        }else{
            deque.addLast(root);
            nodeCount++;
        }

        while(deque.size()>0){
            int length = deque.size();
            while(length>0){
                temp = deque.removeFirst();
                length--;
                if(temp.left!=null){
                    deque.addLast(temp.left);
                    nodeCount++;
                }
                if(temp.right!=null){
                    deque.addLast(temp.right);
                    nodeCount++;
                }
            }
        }
        return nodeCount;
    }
}
