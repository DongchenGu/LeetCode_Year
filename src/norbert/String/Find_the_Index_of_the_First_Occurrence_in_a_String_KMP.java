package norbert.String;

import java.util.HashSet;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class Find_the_Index_of_the_First_Occurrence_in_a_String_KMP {
//    public static void main(String[] args) {
//        String model  ="abiababiabi";
//        char[] model2 = model.toCharArray();
//
//        int[] next = new int[model.length()];
//        next[0]=0;
//        getNext(next,model2);
//
//        for (int i = 0; i <next.length ; i++) {
//            System.out.print(next[i]);
//        }
//    }
        public int strStr(String haystack, String needle) {

            int[] next = new int[needle.length()];
            next[0]=0;
            char[] model = needle.toCharArray();
            getNext(next,model);

            int j =0;
            for(int i=0; i<haystack.length();){
                if(haystack.charAt(i)==model[j]){
                    if(j==model.length-1)
                        return i-j;
                    j++;
                    i++;
                }else if(haystack.charAt(i)!=model[j] && j>0){
                    j=next[j-1];
                }else if(haystack.charAt(i)!=model[j] && j==0){
                    i++;
                }
            }
            return -1;
        }

    public static void getNext(int[] next, char[] model){
        int i=0;
        for(int j =1; j<model.length;j++){
            while (i>0 && model[i]!=model[j]){
                    i= next[i-1];
                }
            if(model[i]==model[j]){
                i++;
                next[j] = i;
            }
        }
    }
}
