package norbert.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class Remove_All_Adjacent_Duplicates_In_String_2 {

    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(!deque.isEmpty() && deque.peek() == s.charAt(i)){
                deque.removeFirst();
                continue;
            }else{
                deque.addFirst(s.charAt(i));
            }
        }

        String result = "";
        while (!deque.isEmpty()){
            result += deque.removeLast();
        }
        return result;
    }
}
