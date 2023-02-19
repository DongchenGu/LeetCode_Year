package norbert.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> expression = new ArrayDeque<>();
        int target1 =0;
        int target2 =0;
        int result = 0;
        for (int i = 0; i <tokens.length ; i++) {
            if(tokens[i].equals("+")){
                target1 =expression.removeFirst();
                target2 =expression.removeFirst();
                result = target1+target2;
                expression.addFirst(result);
            }else if(tokens[i].equals("-")){
                target1 =expression.removeFirst();
                target2 =expression.removeFirst();
                result = target2-target1;
                expression.addFirst(result);
            }else if(tokens[i].equals("*")){
                target1 =expression.removeFirst();
                target2 =expression.removeFirst();
                result = target1*target2;
                expression.addFirst(result);
            }else if(tokens[i].equals("/")){
                target1 =expression.removeFirst();
                target2 =expression.removeFirst();
                result = target2/target1;
                expression.addFirst(result);
            }else{
                expression.addFirst(Integer.valueOf(tokens[i]));
            }

        }

        return expression.removeFirst();
    }
}
