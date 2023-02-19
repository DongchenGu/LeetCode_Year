package norbert.String;

//https://leetcode.com/problems/repeated-substring-pattern/
public class Repeated_Substring_Pattern {

    public boolean repeatedSubstringPattern(String s) {
        int[] Next =getNext(s);
        if(Next[s.length()-1]>0 && s.length()%(s.length()-Next[s.length()-1])==0){
            return true;
        }else{
            return false;
        }
    }

    public int[] getNext(String value){
        int[] result = new int[value.length()];
        result[0] = 0;
        int j=0;
        for (int i = 1; i <value.length() ; i++) {
            while (j>0 && value.charAt(i)!=value.charAt(j)){
                j=result[j-1];
            }
            if(value.charAt(j)==value.charAt(i)){
                j++;
                result[i] = j;
            }
        }
        return result;
    }
}
