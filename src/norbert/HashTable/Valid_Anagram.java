package norbert.HashTable;

import java.util.HashMap;

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



    public static boolean isAnagram2(String s, String t) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(char i : s.toCharArray()){
            if(hmap.containsKey(i)){
                int temp = hmap.get(i);
                temp++;
                hmap.put(i,temp);
            }else{
                hmap.put(i, 1);
            }

        }
        for(char i : t.toCharArray()){
            if(hmap.containsKey(i) && hmap.get(i)>0){
                int temp = hmap.get(i);
                temp--;
                if(temp == 0){
                    hmap.remove(i);
                }else{
                    hmap.put(i,temp);
                }
            }else{
                return false;
            }
        }
        if(hmap.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        boolean temp = isAnagram2("ab","a");
        System.out.println(temp);
    }
}
