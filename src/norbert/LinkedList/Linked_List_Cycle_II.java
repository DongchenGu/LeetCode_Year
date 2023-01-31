package norbert.LinkedList;

//https://leetcode.com/problems/linked-list-cycle-ii/
//https://programmercarl.com/0142.%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8II.html#_142-%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8ii

public class Linked_List_Cycle_II {


  //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {
        if(head == null  || head.next ==null){
            return null;
        }
        ListNode faster = head;
        ListNode slower = head;
        do{
            if(faster == null || faster.next == null){
                return null;
            }
            faster=faster.next.next;
            slower = slower.next;
        }while(faster != slower);
        while(faster != head){
            faster= faster.next;
            head = head.next;
        }

        return faster;
    }
}
