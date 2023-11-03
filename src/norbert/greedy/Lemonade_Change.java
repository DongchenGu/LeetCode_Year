package norbert.greedy;

//https://leetcode.com/problems/lemonade-change/description/
public class Lemonade_Change {

    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten =0;
        for(int i=0; i<bills.length; i++){
            switch (bills[i]){
                case 5:
                    five++;
                    break;
                case 10:
                    ten++;
                    five--;
                    break;
                case 20:
                    if(ten >0){
                        ten--;
                        five--;
                    }else{
                        five-=3;
                    }
                    break;
            }
            if(five <0){return false;}
        }
        return true;
    }
}
