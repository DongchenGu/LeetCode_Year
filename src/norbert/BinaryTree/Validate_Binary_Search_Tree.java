package norbert.BinaryTree;


import java.util.ArrayList;

//https://leetcode.com/problems/validate-binary-search-tree/description/
public class Validate_Binary_Search_Tree {


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



    //笨办法
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        inorderTraverse(arraylist, root);
        int[] temp = arraylist.stream().mapToInt(Integer::valueOf).toArray();
        for(int i=0; i<temp.length; i++){
            if(i!=0 && temp[i]<=temp[i-1]){
                return false;
            }
        }
        return true;
    }

    public void inorderTraverse(ArrayList<Integer> arraylist, TreeNode root){
        if(root ==null){
            return;
        }
        inorderTraverse(arraylist, root.left);
        arraylist.add(root.val);
        inorderTraverse(arraylist, root.right);
    }


    //直接使用中序遍历
    TreeNode max;
    public boolean isValidBST2(TreeNode root) {
        if(root== null){
            return true;
        }

        Boolean left = isValidBST(root.left);
        if(left ==false){return false;}

        if(max!=null &&  max.val >= root.val){
            return false;
        }else{
            max = root;
        }

        Boolean right = isValidBST(root.right);
        if(right==false){return false;}

        return true;
    }


}
