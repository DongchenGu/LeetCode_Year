package norbert.BinaryTree.Different_Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {


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
//使用队列的方式去遍历
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        TreeNode temp=null;
//        if(root!=null)
//        queue.offer(root);
//        int len=0;
//
//        //因为广度优先遍历是一层一层地遍历，所以我们要先记住每一层的长度
//        while (!queue.isEmpty()){
//            List<Integer> tempArray = new ArrayList<>();
//            len = queue.size();
//            while (len >0){
//                temp=queue.poll();
//                tempArray.add(temp.val);
//                if(temp.left!=null){queue.offer(temp.left);};
//                if(temp.right!=null){queue.offer(temp.right);};
//                len--;
//            }
//            result.add(tempArray);
//        }
//        return  result;
//    }

    //使用递归的方式去遍历，因为是层次遍历，所以要记住递归到的层数，然后把节点值添加到List中的那一层
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root!=null)
        dfs(root,result,0);
        return  result;
    }
    public void dfs(TreeNode current, List<List<Integer>> result,int deep){
          if(result.size()-1>=deep){
              result.get(deep).add(current.val);
          }else{
              List<Integer> level = new ArrayList<>();
              level.add(current.val);
              result.add(level);
          }
          if(current.left==null && current.right==null){ return;}
         if(current.left!=null){dfs(current.left,result,deep+1);}
         if(current.right!=null) dfs(current.right,result,deep+1);
    }

}
