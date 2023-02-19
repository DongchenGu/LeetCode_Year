package norbert.Stack_Queue;

import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/description/
public class Implement_Queue_using_Stacks {

    class MyQueue {
        public Stack<Integer> InStack;
        public Stack<Integer> OutStack;

        public MyQueue() {
            InStack = new Stack<>();
            OutStack = new Stack<>();
        }

        public void push(int x) {
            InStack.push(x);
        }

        public int pop() {
            if(OutStack.empty()){
                while (!InStack.empty()){
                    OutStack.push(InStack.pop());
                }
                return  OutStack.pop();
            }else{
                return  OutStack.pop();
            }
        }

        public int peek() {
            if(OutStack.empty()){
                while (!InStack.empty()){
                    OutStack.push(InStack.pop());
                }
                return  OutStack.peek();
            }else {
                return  OutStack.peek();
            }
        }

        public boolean empty() {
            if(OutStack.empty() && InStack.empty()){
                return  true;
            }else{
                return  false;
            }
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
