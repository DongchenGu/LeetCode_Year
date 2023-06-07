package norbert.BinaryTree;






import java.util.Arrays;

//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
public class Binary_Tree_from_Inorder_and_Postorder_Traversal {



    //  Definition for a binary tree node.
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


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return traverse(inorder, postorder);
    }

    public TreeNode traverse(int[] inorder, int[] postorder){

        if(postorder.length == 1){
            return new TreeNode(postorder[0], null,null);
        }
        if(postorder.length == 0){
            return null;
        }
        int val = postorder[postorder.length-1];
        TreeNode root = new TreeNode(val);
        int cutIndex = 0;
        while(true){
            if(inorder[cutIndex]!= val){
                cutIndex++;
            }else{
                break;
            }
        }


        int[] leftInorder = Arrays.copyOfRange(inorder, 0, cutIndex);
        int[] rightInorder =  Arrays.copyOfRange(inorder, cutIndex+1, inorder.length);
        int[] leftPostOrder = Arrays.copyOfRange(postorder, 0, cutIndex);
        int[] rightPostOrder = Arrays.copyOfRange(postorder,cutIndex, postorder.length-1);

        TreeNode left = traverse(leftInorder,leftPostOrder);
        TreeNode right = traverse(rightInorder, rightPostOrder);
        root.left = left;
        root.right= right;
        return root;
    }
}
