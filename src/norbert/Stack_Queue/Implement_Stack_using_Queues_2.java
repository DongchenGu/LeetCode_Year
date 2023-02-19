package norbert.Stack_Queue;


import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/
public class Implement_Stack_using_Queues_2 {
    class MyStack {
        //每次填进新的元素后，要让realStack保持是按照栈的顺序排列
        public Queue<Integer> realStack;
        public  Queue<Integer> fakeStack;

        public MyStack() {
            realStack   = new LinkedList<>();
            fakeStack   = new LinkedList<>();
        }
        public void push(int x) {
            fakeStack.offer(x);
            //x填进来是新元素，要让新元素在前面，所以再把原来realStack里面的挪过来，之后再挪回去
            while (realStack.size()>0){
                fakeStack.offer(realStack.poll());
            }
            //再挪回去
            Queue<Integer> temp = realStack;//现在这里是空的
            realStack = fakeStack;
            fakeStack = temp;
        }
        public int pop() {
            //直接从realStack上面取就行
            return realStack.poll();
        }
        public int top() {
            return realStack.peek();
        }

        public boolean empty() {
            if(realStack.size()>0){
                return false;
            }else{
                return  true;
            }
        }
    }
}
