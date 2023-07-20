package norbert.Backtracking;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://leetcode.com/problems/restore-ip-addresses/description/
public class Restore_IP_Addresses {

    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    List<String> temp  = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backTracking(s, 0, 1);
        return result;
    }
    public void backTracking(String s, int startIndex, int time){
        if(time ==5){
            if(startIndex ==s.length()){
                Iterator it = temp.iterator();
                while(it.hasNext()){
                    sb.append(it.next());
                    sb.append(".");
                }
                sb.delete(sb.length()-1,sb.length());
                result.add(sb.toString());
                sb.delete(0,sb.length());
            }else{
                return;
            }
        }

        for(int i=startIndex; i<s.length(); i++){
            if(isValid(s,startIndex,i)){
                temp.add(s.substring(startIndex,i+1));
                backTracking(s,i+1,time+1);
                temp.remove(temp.size()-1);
            }else{
                continue;
            }
        }
        return;
    }

    public boolean isValid(String s, int left, int right){
        if( right!=left && s.charAt(left)=='0' ){
            return false;
        }
        if((right-left+1)>3){
            return false;
        }
        int test = Integer.parseInt(s.substring(left,right+1));
        if(test>255){
            return false;
        }
        return true;
    }

}
