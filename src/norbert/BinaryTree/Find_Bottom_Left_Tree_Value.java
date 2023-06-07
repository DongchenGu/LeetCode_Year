package norbert.BinaryTree;

import java.util.ArrayDeque;

public class Find_Bottom_Left_Tree_Value {


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



    public int findBottomLeftValue(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int result =0;
        TreeNode temp;

        if(root!=null){
            deque.addLast(root);
        }

        while(deque.size()>0){
            int length = deque.size();
            for(int i =0; i< length ;i++){
                temp = deque.removeFirst();
                if(i==0){
                    result= temp.val;
                }
                if(temp.left!=null){
                    deque.addLast(temp.left);
                }
                if(temp.right!=null){
                    deque.addLast(temp.right);
                }
            }

        }


        return result;
    }
}
