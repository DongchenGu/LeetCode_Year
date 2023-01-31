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
}
