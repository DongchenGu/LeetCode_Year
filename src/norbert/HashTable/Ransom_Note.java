package norbert.HashTable;

import java.util.HashMap;

//https://leetcode.com/problems/ransom-note/
public class Ransom_Note {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> magazineMap = new HashMap<>();
        for (int i =0;i<magazine.length(); i++){
            if(magazineMap.containsKey(magazine.charAt(i))){
                int temp = magazineMap.get(magazine.charAt(i));
                magazineMap.put(magazine.charAt(i),temp+1);
            }else {
                magazineMap.put(magazine.charAt(i),1);
            }
        }

        for (int i =0;i<ransomNote.length(); i++){
            if(magazineMap.containsKey(ransomNote.charAt(i))){
                int temp = magazineMap.get(ransomNote.charAt(i));
                magazineMap.put(ransomNote.charAt(i),temp-1);
                if(temp==0){
                    return  false;
                }
            }else {
                return  false;
            }
        }
        return  true;
    }
}
