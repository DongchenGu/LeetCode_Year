package norbert.LinkedList;


import java.util.List;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class Swap_Nodes_in_Pairs {


     //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode swapPairs(ListNode head) {
            if(head==null){
                return null;
            }
            if(head.next == null){
                return head;
            }
            ListNode newHead = head.next;
            ListNode pre = head;
            ListNode current = head.next;
            ListNode temp = head;

            while (temp!=null){
                //想把相邻两个转过来，
                temp = current.next;
                current.next = pre;

                if(temp != null){
                    if(temp.next !=null){
                        pre.next = temp.next;
                        //然后向前前进
                        current = temp.next;
                        pre = temp;
                    }else{
                        pre.next = temp;
                        temp.next=null;
                        return  newHead;
                    }
                }else{
                    pre.next = null;
                }
            }
            return  newHead;
        }

}
