package norbert.BinaryTree.Different_Traversal;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_II {


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

     //第一种方法，使用迭代遍历然后把得到的 list翻转，然后就有了
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){return result;}else{
            queue.offer(root);
        }

        TreeNode temp;
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer> level = new ArrayList<>();
            while(len>0){
                temp=queue.poll();
                level.add(temp.val);
                if(temp.left!=null){queue.offer(temp.left);}
                if(temp.right!=null){queue.offer(temp.right);}
                len--;
            }
            result.add(level);
        }

        int right = result.size()-1;
        List<List<Integer>> ReverseResult = new ArrayList<>();
        while(right>=0){
            ReverseResult.add(result.get(right));
            right--;
        }

        return ReverseResult;
    }

}
