package interview;

//描述
//        求一个字符串中最长的连续出现的字符，输出该字符及其出现次数。字符串中无空白字符（空格、回车和tab），如果这样的字符不止一个，则输出出现最早的字符。
//
//        输入
//        一行，一个不包含空白字符的字符串，字符串长度小于200。
//        输出
//        一行，输出最长的连续出现的字符及其最长的连续出现次数，中间以一个空格分
//        ————————————————
//        版权声明：本文为CSDN博主「xcdq」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/xcdq_aaa/article/details/106641237
public class String2 {


    public static void main(String[] args) {
        getLongestSubString2("asllllllbeeeefff");
    }
    //使用一个指针来写
        public static  void getLongestSubString1(String input){
            int count =1;
            Character maxChar= null;
            int maxCount =0;
            for(int i =0; i<input.length()-1;i++){
                if (input.charAt(i)==input.charAt(i+1)){
                    count++;
                    continue;
                }else{
                    if(count>maxCount){
                        maxCount=count;
                        maxChar=input.charAt(i);
                    }
                    count=1;
                }
            }
            System.out.println("char:" + maxChar+ " "+"times:"+maxCount);
        }
        //使用两个指针来写
        public static  void getLongestSubString2(String input){
            int count =1;
            Character maxChar= null;
            int maxCount =0;
            for(int i=0,j =1;j<input.length();){
                if(input.charAt(i)==input.charAt(j)){
                    j++;
                    continue;
                }else{
                    if(j-i>maxCount){
                        maxCount=j-i;
                        maxChar=input.charAt(i);
                    }
                    i=j;
                    j++;
                }
            }
            System.out.println("char:" + maxChar+ " "+"times:"+maxCount);
        }
}
