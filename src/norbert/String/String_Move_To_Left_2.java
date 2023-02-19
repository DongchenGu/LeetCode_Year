package norbert.String;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
public class String_Move_To_Left_2 {

    //只用双指针的方法来实现，
    public String reverseLeftWords(String s, int n) {
        //先将整个S翻转
        char[] sChar = s.toCharArray();
        reverse(sChar,0,sChar.length-1);
        //接着我们需要翻转后n个字符，和前length-n个字符
        reverse(sChar,0,sChar.length-n-1);
        reverse(sChar,sChar.length-n, sChar.length-1);
        return new String(sChar);
    }
    public void  reverse(char[] result, int start, int end){
        while (start<end){
            Character temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }

    }
}
