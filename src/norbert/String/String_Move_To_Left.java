package norbert.String;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
public class String_Move_To_Left {

    public String reverseLeftWords(String s, int n) {

        //第一种方式，使用队列解决
        char[] sChar = s.toCharArray();
        //把前面几个char拿到队列里面
        Queue<Character> tempQueue = new LinkedList<>();
        for(int i=0;i<n;i++){
            tempQueue.offer(sChar[i]);
        }
        //然后用双指针，将他们挪动到字符串后面
        int left = 0;
        int right = n;
        while (right<s.length()){
            sChar[left] = sChar[right];
            left++;
            right++;
        }
        while (left<s.length()){
            sChar[left] = tempQueue.poll();
            left++;
        }
        return new String(sChar);
    }
}
