package norbert.HashTable;

import java.util.HashSet;
import java.util.Set;

//
public class Happy_Number {

    public boolean isHappy(int n) {
        int sum=0;
        int tempN = n;
        Set<Integer> check = new HashSet<>();
        while(true){
            while(tempN!=0){
                int temp = tempN%10;
                sum += temp*temp;
                tempN = tempN/10;
            }
            if(check.contains(sum)){
                return false;
            }else{
                check.add(sum);
            }
            tempN = sum;
            sum =0;
            if(tempN ==1){
                return true;
            }

        }

    }

    public static  boolean isHappy2(int n) {
        String N = String.valueOf(n);
        HashSet<Integer> pool = new HashSet<>();
        int sum = 0;

        while(true){
            for(int i =0; i<N.length(); i++){
                int num = Integer.valueOf(N.charAt(i));
                System.out.println("num:"+num);
                int temp = num*num;
                sum+=temp;
            }
            System.out.println(sum);
            if(sum==1){
                return true;
            }
            if(pool.contains(sum)){
                return false;
            }
            N =String.valueOf(sum);
            pool.add(sum);
            sum=0;
        }
    }
    public static void main(String[] args) {
        isHappy2(19);
    }
}
