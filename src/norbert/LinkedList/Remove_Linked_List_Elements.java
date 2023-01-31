package norbert.LinkedList;

//https://leetcode.com/problems/remove-linked-list-elements/
//删除单链表中的元素

public class Remove_Linked_List_Elements {

    public static void main(String[] args) {

    }

     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static  ListNode removeElements(ListNode head, int val) {

        ListNode VirtualHead;
        ListNode PreNode;
        ListNode Node;
        if (head == null){
            return head;
        }else{
            VirtualHead = new ListNode(-1,head); //添加一个虚拟节点，防止头节点也需要被移除，不添加虚拟节点需要写两个while循环
            PreNode = VirtualHead;
            Node =head;
        }

        while (Node!=null){
            if(Node.val ==val){
                PreNode.next = Node.next;
                Node= PreNode.next;
            }else{
                PreNode =Node;
                Node = Node.next;
            }
        }
            return VirtualHead.next;
    }
}
