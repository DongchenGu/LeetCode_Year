package norbert.String;

import java.util.Stack;

//https://leetcode.com/problems/reverse-words-in-a-string/
public class Reverse_Words_in_a_String {

//    public String reverseWords(String s) {
//        StringBuffer output = new StringBuffer();
//        Stack<Character> word = new Stack<>();
//
//        int pointer = s.length()-1;
//        while(true ){
//            if(pointer == -1){
//                break;
//            }
//            //因为S结尾可能有多个空格
//            while(pointer>=0 && s.charAt(pointer) == ' '){
//                pointer--;
//            }
//            while(pointer>=0 && s.charAt(pointer)!= ' '){
//                word.push(s.charAt(pointer));
//                pointer--;
//            }
//            if(!word.empty()){
//                if(!output.isEmpty()){
//                    output.append(' ');
//                }
//                while (!word.empty()){
//                    output.append(word.pop());
//                }
//            }
//        }
//        return output.toString();
//    }
}
