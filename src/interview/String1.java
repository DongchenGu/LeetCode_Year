package interview;

import java.util.*;

//从一个字符串中找到最长连续字符，注意最长的连续字符可能有多个, 要求返回String[]
public class String1 {
    public static void main(String[] args) {
        String[] str = getMaxLongChar("asvbbbddgbbbghghbbb");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public static String[] getMaxLongChar(String input) {
        ArrayList<String> result = new ArrayList<String>();
        int length=0;
        for (int i = 0, j=1; i <input.length() && j<input.length(); ) {
            if(input.charAt(j)!=input.charAt(i)){
                i++;
                j++;
                continue;
            }
            while (j<input.length() && input.charAt(i) == input.charAt(j) ){
                j++;
            }
            if(j-i>=length){
                length = j-i;
                result.add(input.substring(i,j));
            }
            i=j;
            j++;
        }
        return result.toArray(new String[result.size()]);
    }

}
