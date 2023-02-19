
package norbert.Stack_Queue;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class Valid_Parentheses {
    public boolean isValid(String s) {
        if(s =="")
            return  true;
        Stack<Character> closeBracket = new Stack<>();

        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='('){
                closeBracket.push(')');
            }else if(s.charAt(i)== '{'){
                closeBracket.push('}');
            }else if(s.charAt(i)=='['){
                closeBracket.push(']');
            }else if(s.charAt(i)==')'){
                if(closeBracket.empty() || closeBracket.peek()!=')'){
                    return false;
                }else{
                    closeBracket.pop();
                }
            }else if(s.charAt(i)=='}'){
                if(closeBracket.empty() || closeBracket.peek()!='}'){
                    return false;
                }else{
                    closeBracket.pop();
                }
            }else if(s.charAt(i)==']'){
                if(closeBracket.empty() || closeBracket.peek()!=']'){
                    return false;
                }else{
                    closeBracket.pop();
                }
            }
        }
        if(closeBracket.empty()){
            return true;
        }else {
            return false;
        }
    }
}
