package norbert.LinkedList;

//https://leetcode.com/problems/reverse-linked-list/
public class Reverse_LinkedList {


     //Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    //双指针法
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        ListNode temp =null;

        while(current != null){
            //switch the two nodes;
            temp = current.next;
            current.next = pre;

            pre = current;
            current = temp;
        }

        return pre;
    }

}
