package norbert.String;

//https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
public class Replace_Blank_In_String_2 {

    public String replaceSpace(String s) {
       char[] Schar = s.toCharArray();
       StringBuffer SB = new StringBuffer();
       int count = 0;
        for (int i = 0; i <Schar.length ; i++) {
            if(Schar[i] == ' '){
                count++;
                SB.append("  ");
            }
        }
        if(count==0) return s; //s中没有空格，直接返回
        int left = s.length()-1;
        //将原字符串扩展空间
        s+=SB;
        char[] result = s.toCharArray();
        int right = result.length-1;
        while (left>=0){
            if(result[left]!=' '){
                result[right] = result[left];
                right--;
                left--;
            }else{
                result[right--]='0';
                result[right--]='2';
                result[right--]='%';
                left--;
            }
        }
        return new String(result);
    }
}
