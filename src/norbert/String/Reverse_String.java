package norbert.String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

//https://leetcode.com/problems/reverse-string/
public class Reverse_String {

    public void reverseString(char[] s) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i=s.length-1;i>=0; i--){
            result.add(s[i]);
        }
        for(int i =0; i<result.size();i++){
            s[i]=(char)result.get(i);
        }
    }
}
