package norbert.LinkedList;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class Swap_Nodes_in_Pairs2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        //创建一个虚拟头节点
        ListNode virtual = new ListNode();
        virtual.next = head;
        ListNode temp1;
        ListNode temp2;

        ListNode current = virtual;
        while(current.next!= null && current.next.next!= null){
            //先保存两个临时指针
            temp1 = current.next;
            temp2 = current.next.next.next;
            //交换current后面的两个节点的顺序
            current.next = current.next.next;
            current.next.next = temp1;
            temp1.next = temp2;

            //把current指针往前推进
            current= temp1;
        }

        return virtual.next;
    }


}
