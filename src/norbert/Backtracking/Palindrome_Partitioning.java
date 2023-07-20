package norbert.Backtracking;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/palindrome-partitioning/description/
public class Palindrome_Partitioning {

    List<List<String>> result = new ArrayList<>();
    List<String> temp = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTracking(s,0);
        return result;
    }

    public void backTracking(String s, int startIndex){
        if(startIndex == s.length()){
            result.add(new ArrayList<String>(temp));
            return;
        }

        for(int i=startIndex; i<s.length();i++){
            if(isPalindrome(s,startIndex,i)){
                temp.add(s.substring(startIndex,i+1));
                backTracking(s,i+1);
                temp.remove(temp.size()-1);
            }else{
                continue;
            }
        }
        return;
    }

    public boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){return false;}
            left++;
            right--;
        }
        return true;
    }
}
