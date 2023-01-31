package norbert.LinkedList;


//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Intersection_of_Two_Linked_Lists {


      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //get the lengh of two linked list
        int A =0, B=0;
        ListNode current = headA;
        while(current!= null){
            A++;
            current = current.next;
        }
        current = headB;
        while(current!= null){
            B++;
            current = current.next;
        }
        int interval = Math.abs(A-B);
        //将长的那一个补回来
        ListNode currentA = headA, currentB=headB;
        if(A < B){
            for (int i =0; i<interval; i++){
                currentB =currentB.next;
            }
        }else{
            for (int i =0; i<interval; i++){
                currentA =currentA.next;
            }
        }
        //将两个指针同时移动并判断是否相等
        while (currentA!=currentB){
            currentA = currentA.next;
            currentB=currentB.next;
            //跳出循环只有两种情况：1：遇到两个链表的相交点，2：没有相交点最终都走到了null，所以相等
        }

        return currentA;

    }
}
