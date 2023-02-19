package norbert.String;

import java.util.stream.Stream;

//https://leetcode.com/problems/reverse-string-ii/
public class Reverse_String2 {
    public String reverseStr(String s, int k) {
        char[] sArray = s.toCharArray();
        int right =0;

        for(int LP = 0; LP<sArray.length; LP+=(k*2) ) {
            if (LP + k-1< sArray.length) {
                right = LP + k - 1;
            } else {
                right = sArray.length - 1;
            }
            for (int i = LP; i < right; i++) {
                char temp = sArray[i];
                sArray[i] = sArray[right];
                sArray[right] = temp;
                right--;
            }
        }
        return new String(sArray);
    }
}
