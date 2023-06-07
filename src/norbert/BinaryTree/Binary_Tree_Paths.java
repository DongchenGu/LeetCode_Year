package norbert.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {

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

    //递归解法
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<Integer> path  = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        if(root == null){
            return result;
        }else{
            buildPath(root, path,result);
        }
        return result;

    }

    public void buildPath(TreeNode root, ArrayList<Integer> path, ArrayList<String>result){
        path.add(root.val);
        if(root.left == null && root.right==null){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< path.size(); i++){
                if(i>0){
                    sb.append("->");
                }
                sb.append(path.get(i));
            }
            result.add(sb.toString());
            return;
        }

        if(root.left!=null){
            buildPath(root.left, path, result);
            path.remove(path.size()-1);
        }
        if(root.right!=null){
            buildPath(root.right, path, result);
            path.remove(path.size()-1);
        }

    }
}
