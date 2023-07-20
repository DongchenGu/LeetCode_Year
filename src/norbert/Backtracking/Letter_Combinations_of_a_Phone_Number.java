package norbert.Backtracking;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class Letter_Combinations_of_a_Phone_Number {

    String[] map =new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();


    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0){return result;}
        int[] digitInt = new int[digits.length()];
        for(int i=0; i<digits.length(); i++){
            digitInt[i] = digits.charAt(i) - '0';
        }

        backTracking(digitInt,0);
        return result;
    }

    public void backTracking( int[] digitInt, int number){
        if(sb.length()== digitInt.length){
            result.add(sb.toString());
            return;
        }

        for(int k = 0; k< map[digitInt[number]].length(); k++){
            sb.append(map[digitInt[number]].charAt(k));
            backTracking(digitInt,number+1);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}
