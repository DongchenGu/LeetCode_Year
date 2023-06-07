package norbert.BinaryTree.Different_Traversal;

//https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class N_ary_Tree_Level_Order_Traversal {

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<List<Integer>> levelOrder(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){return result;};
        deque.offerLast(root);
        int len=0;
        Node temp;

        while(!deque.isEmpty()){
            len =deque.size();
            List<Integer> level = new ArrayList<>();
            while(len>0){
                temp = deque.pollFirst();
                level.add(temp.val);
                List<Node> children = temp.children;
                if(children==null || children.size()==0){len--;continue;}
                for(Node i: children){
                    if(i!=null){deque.addLast(i);}
                }
                len--;
            }
            result.add(level);
        }
        return result;
    }

}
