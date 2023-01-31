package norbert.LinkedList;

import java.util.List;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class Remove_Nth_Node_From_End_of_List {

    //使用快慢指针的方法

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode virtualHead = new ListNode();
          virtualHead.next = head;
        ListNode faster = virtualHead;
        ListNode slower = virtualHead;
        for(int i=0; i<n; i++){
            faster = faster.next;
        }
        if(head!= null && head.next!=null){
           while (faster.next!=null){
               faster = faster.next;
               slower  = slower.next;
           }
        }
        slower.next = slower.next.next;
        return virtualHead.next;
    }
}
