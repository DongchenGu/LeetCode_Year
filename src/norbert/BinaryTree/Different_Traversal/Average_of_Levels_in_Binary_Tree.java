package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
public class Average_of_Levels_in_Binary_Tree {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(45,null,null);
        List<Double> result = averageOfLevels(tree);
        System.out.println(result.get(0));
    }

     // Definition for a binary tree node.
      public static class TreeNode {
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

    public static  List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp;
        if(root!=null){
            queue.offer(root);
        }
        int len;
        while(!queue.isEmpty()){
            len= queue.size();
            Double sum=0.0;
            int count= len;
            while(count>0){
                temp = queue.poll();
                sum += temp.val;
                if(temp.left!=null){queue.offer(temp.left);}
                if(temp.right!=null){queue.offer(temp.right);}
                count--;
            }

            result.add(sum/len);
        }
        return result;
    }

}
