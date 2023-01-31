package norbert.LinkedList;

import org.w3c.dom.ls.LSOutput;
//https://leetcode.com/problems/design-linked-list/


public class DesignLinkedList2 {
    class ListNode{
        public int val;
        public ListNode next;
        public ListNode(){};
        public ListNode( int val){
            this.val = val;
            this.next = null;
        };
    }


    class MyLinkedList {
        int size;
        ListNode head;
        public MyLinkedList() {
            this.head  = new ListNode();
            this.head.next = null;
            this.size =0;
        }

        public int get(int index) {
            ListNode temp = this.head;
            if(index < this.size ){
                for(int i=-1; i<index; i++){
                    temp = temp.next;
                }
                return temp.val;
            }else{
                return -1;
            }

        }

        public void addAtHead(int val) {
            ListNode newNode = new ListNode(val);
            newNode.next = this.head.next;
            this.head.next= newNode;
            this.size++;
        }

        public void addAtTail(int val) {
            ListNode newNode= new ListNode(val);
            ListNode temp = this.head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next = newNode;
            this.size++;
        }

        public void addAtIndex(int index, int val) {
            ListNode newNode = new ListNode(val);
            ListNode temp = this.head;

            if(index < this.size){
                for(int i=-1; i< index-1; i++){
                    temp= temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                this.size++;
            }else if(index == this.size){
                while(temp.next!=null){
                    temp= temp.next;
                }
                temp.next = newNode;
                this.size++;
            }else{
                return;
            }
        }

        public void deleteAtIndex(int index) {
            ListNode temp = this.head;
            if(index < this.size){
                for(int i=-1; i<index-1; i++ ){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                this.size--;
            }
        }


    }


    public static void main(String[] args) {

    }
}
