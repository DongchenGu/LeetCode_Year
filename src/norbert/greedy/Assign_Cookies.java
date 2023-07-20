package norbert.greedy;

import java.util.Arrays;


//https://leetcode.com/problems/assign-cookies/description/
public class Assign_Cookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result=0;
        int index =s.length-1;
        for(int i=g.length-1; i>=0; i--){
            if(index>=0 && s[index] <g[i] ){
                continue;
            }else if(index>=0 && s[index] >=g[i] ){
                result++;
                index--;
            }else{
                break;
            }
        }
        return result;
    }

}
