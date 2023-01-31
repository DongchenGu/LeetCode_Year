package norbert.HashTable;

//https://leetcode.com/problems/valid-anagram/description/
public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        int[] numberArray = new int[26];
        for(int i=0; i<numberArray.length;i++){
            numberArray[i]=0;
        }

        for(int i=0; i<schar.length;i++){
            numberArray[schar[i]-'a']++;
        }

        for(int i=0; i<tchar.length;i++){
            numberArray[tchar[i]-'a']--;
        }
        for(int i=0; i<numberArray.length;i++){
            if(numberArray[i]!= 0){
                return false;
            }

        }
        return true;
    }
}
