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


    //递归法方案1
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }else{
            return swapBetween(null, head);
        }
    }
    public ListNode swapBetween(ListNode pre, ListNode current){
        if(current == null){
            return pre;
        }else{
            ListNode temp = current.next;
            current.next = pre;
            return swapBetween(current, temp);
        }
    }

    //递归法方案2
    ListNode newHead = null;
    public ListNode reverseList3(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }else{
            reverse(head);
            head.next = null;
            return newHead;
        }
    }
    public ListNode reverse(ListNode remain){
        if(remain.next == null){
            newHead  = remain;
            return remain;
        }else{
            ListNode temp = reverse(remain.next);
            temp.next = remain;

            return remain;
        }
    }
}
