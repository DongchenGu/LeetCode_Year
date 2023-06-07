package norbert.BinaryTree;


import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
public class Maximum_Depth_of_N_ary_Tree {

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


    public int maxDepth(Node root) {
        Node temp  = null;
        int maxlength = 0;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        if(root ==null){
            return maxlength;
        }else{
            deque.addLast(root);
        }

        while(deque.size()>0){
            int length = deque.size();
            while(length>0){
                temp = deque.removeFirst();
                Iterator<Node> it = temp.children.iterator();
                while(it.hasNext()){
                    deque.addLast(it.next());
                }
                length--;
            }
            maxlength++;
        }
        return maxlength;
    }
}
