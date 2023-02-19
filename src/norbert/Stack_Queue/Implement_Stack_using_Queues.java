package norbert.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/
public class Implement_Stack_using_Queues {

    class MyStack {
        public  Queue<Integer> queue;
        public  Queue<Integer> BackQueue;

        public MyStack() {
            queue     = new LinkedList<>();
            BackQueue = new LinkedList<>();
        }
        public void push(int x) {
            queue.offer(x);
        }

        public int pop() {
            while (queue.size()!=1){
                BackQueue.offer(queue.poll());
            }
            int result = queue.poll();
            while (BackQueue.size()!=0){
                queue.offer(BackQueue.poll());
            }
            return  result;
        }

        public int top() {
            while (queue.size()!=1){
                BackQueue.offer(queue.poll());
            }
            int result = queue.poll();
            BackQueue.offer(result);
            while (BackQueue.size()!=0){
                queue.offer(BackQueue.poll());
            }
            return  result;
        }

        public boolean empty() {
            if(queue.size()>0){
                return false;
            }else {
                return  true;
            }
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
