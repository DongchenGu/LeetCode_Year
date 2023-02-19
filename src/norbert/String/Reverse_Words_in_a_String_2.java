package norbert.String;


public class Reverse_Words_in_a_String_2 {

    public String reverseWords(String s) {
        //双指针法
        //首先把整个string翻转过来
        char[] sChar = s.toCharArray();
        reverse(sChar,0,sChar.length-1);
        //然后取出多余的空格，每个单词之间只有一个空格
        int left= 0;
        int right = 0;
        while (right<sChar.length){
            if(sChar[right]==' '){
                right++;
            }else{
                if(left!=0 && sChar[right-1]==' '){
                    sChar[left]=' ';
                    left++;
                }
                sChar[left]=sChar[right];
                left++;
                right++;
            }
        }
        //现在确定了总长度
        int length = left-1;
        int j=0;
        // //然后再翻转每个单词
        for(int i=0; i<=length; ){
            int current =i;
            j = i;
            while (j<=length && sChar[j]!=' '){j++;}
            reverse(sChar,current,j-1);
            i=j+1;
        }

        return new String(sChar,0,length+1);
    }
    //拿出来写个函数来翻转每个单词
    public void reverse(char[] target, int left, int right){
        while (left < right){
            char temp = target[left];
            target[left] = target[right];
            target[right] = temp;
            left++;
            right--;
        }
    }
}
