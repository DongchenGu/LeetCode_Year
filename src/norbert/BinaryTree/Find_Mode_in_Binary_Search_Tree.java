package norbert.BinaryTree;


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

//https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
public class Find_Mode_in_Binary_Search_Tree {


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


    //迭代的方法
    public int[] findMode(TreeNode root) {
        int maxCount=0;
        int count=1;
        HashSet<Integer> result = new HashSet<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        TreeNode cur=null;
        TreeNode pre =null;


        deque.add(root);

        while(deque.size()>0){
            cur= deque.removeFirst();
            if(cur.left == null && cur.right== null){
                if(pre!=null){
                    if(cur.val == pre.val){
                        count++;
                    }else{
                        count=1;
                    }
                }
                if(count > maxCount){  maxCount = count; result.clear(); result.add(cur.val);}
                if(count == maxCount){  result.add(cur.val);}
                pre = cur;
            }else{
                if(cur.right!=null){
                    deque.addFirst(cur.right);
                }
                deque.addFirst(new TreeNode(cur.val, null, null));
                if(cur.left!=null){
                    deque.addFirst(cur.left);
                }
            }


        }
        int[] R = new int[result.size()];
        Iterator it = result.iterator();
        for(int i=0; i<result.size(); i++){
            R[i] = (int)it.next();
        }
        return R;
    }


    //递归的方法
    int count =1;
    int maxCount =0;
    TreeNode pre = null;
    public int[] findMode2(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        inOrder(set, root);
        Iterator it = set.iterator();
        int[] R = new int[set.size()];
        for(int i=0; i<R.length; i++){
            R[i] = (int)it.next();
        }
        return R;
    }

    public void inOrder(HashSet<Integer> set, TreeNode cur){
        if(cur == null){
            return;
        }
        inOrder(set, cur.left);
        if(pre!=null){
            if(cur.val == pre.val){
                count++;
            }else{
                count=1;
            }
        }
        if(count > maxCount){
            maxCount = count;
            set.clear();
            set.add(cur.val);
        }else if(count == maxCount){
            set.add(cur.val);
        }
        pre = cur;
        inOrder(set, cur.right);
    }
}
