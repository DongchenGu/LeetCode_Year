package norbert.Stack_Queue;

import java.util.*;

public class Sliding_Window_Maximum_2 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue  myQueue = new MyQueue();
        ArrayList<Integer> result = new ArrayList<>();
        //先把前k个，也就是第一组处理完，然后再处理后面的
        for (int p =0; p<k;p++){
            myQueue.push(nums[p]);
        }
        result.add(myQueue.getMax());

        int i=0;
        int j = k;
        while (j<nums.length){
            myQueue.push(nums[j]);
            myQueue.pop(nums[i]);
            result.add(myQueue.getMax());
            i++;
            j++;
        }
        return result.stream().mapToInt(f->f).toArray();
    }

    public class MyQueue{
        private Deque<Integer> customedDeque = new ArrayDeque<>();

        public void push(int value){
            if(customedDeque.isEmpty()){
                customedDeque.addLast(value);
            }else{
                while (customedDeque.peekLast()!=null && customedDeque.peekLast()<value){customedDeque.removeLast();}
                customedDeque.addLast(value);
            }
        };
        public void pop(int value){
            if(customedDeque.peekFirst()==value){
                customedDeque.removeFirst();
            }
        }
        public int getMax(){
            return customedDeque.peekFirst();
        }
    }
}
