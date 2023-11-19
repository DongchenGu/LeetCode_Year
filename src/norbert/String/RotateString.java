package norbert.String;

//https://leetcode.com/problems/rotate-string/description/
public class RotateString {

    public boolean rotateString(String s, String goal) {

        char[] S = s.toCharArray();
        if(s.length()!= goal.length()){return false;}

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length; i++){
            sb.append(S[i]);
        }
        for(int i=0; i<S.length; i++){
            if(sb.toString().equals(goal)){return true;}
            else{sb.delete(0,1);
                sb.append(S[i]);
            }
        }

        return false;
    }

}
