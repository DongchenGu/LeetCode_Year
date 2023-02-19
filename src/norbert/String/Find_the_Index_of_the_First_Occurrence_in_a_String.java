package norbert.String;

import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class Find_the_Index_of_the_First_Occurrence_in_a_String {

    public int strStr(String haystack, String needle) {

        char[] hay = haystack.toCharArray();
        int length = needle.length();
        HashSet<String> result = new HashSet<>();
        result.add(needle);
        for(int i =0; i<=haystack.length()-length;i++){
            if(result.contains(new String(hay,i,i+length))){
                return i;
            }
        }
        return -1;
    }
}
