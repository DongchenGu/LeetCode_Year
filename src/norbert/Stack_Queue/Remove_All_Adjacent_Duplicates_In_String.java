package norbert.Stack_Queue;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class Remove_All_Adjacent_Duplicates_In_String {
//cbbcc
    public String removeDuplicates(String s) {
        Stack<Character> tempStack = new Stack<>();
        Stack<Character> reverse = new Stack<>();

        for (int i = 0; i < s.length() ; ) {
            if(!tempStack.empty() && tempStack.peek()==s.charAt(i)){
                tempStack.pop();
                i++;
            }else{
                tempStack.push(s.charAt(i));
                i++;
            }
        }
        String result = "";
        while (!tempStack.empty()){
            reverse.push(tempStack.pop());
        }
        while (!reverse.empty()){
            result+=reverse.pop();
        }
        return result;
    }
}
