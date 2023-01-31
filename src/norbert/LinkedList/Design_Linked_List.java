package norbert.LinkedList;

//https://leetcode.com/problems/design-linked-list/

public class Design_Linked_List {
//wrong answer

    class ListNode{
        public int val;
        public ListNode next;
        public ListNode( ){};
        public ListNode(int val){
            this.val = val;
        }
    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */

    class MyLinkedList {
        ListNode virtualNode;
        ListNode head  =null;
        int size;

        public MyLinkedList() {
            virtualNode = new ListNode();
            virtualNode.next = null;
            size = 0;
        }

        public int get(int index) {
            ListNode current= virtualNode;
            if(index>=size){
                return -1;
            }else{
                for (int i = 0; i <= index ; i++) {
                    current = current.next;
                }
            }
            return  current.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            ListNode current  = virtualNode;
            ListNode temp = new ListNode(val);
            if(index>size){
                return;
            }
            for (int i = 0; i <index ; i++) {
                current=current.next;
            }
            temp.next = current.next;
            current.next = temp;
            head = virtualNode.next;
            size++;
        }

        public void deleteAtIndex(int index) {

            ListNode current = virtualNode;
            if(index >=size){
                return;
            }
            size--;
            if(index ==0){
                current.next = current.next.next;
                return;
            }
            for (int i = 0; i <index ; i++) {
                current = current.next;
            }
            current.next = current.next.next;

        }
    }

}
