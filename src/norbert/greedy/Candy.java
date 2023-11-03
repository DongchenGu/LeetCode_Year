package norbert.greedy;


import java.util.Arrays;

//https://leetcode.com/problems/candy/
public class Candy {
    public int candy(int[] ratings) {
        int[] real = new int[ratings.length];
        Arrays.fill(real,1);
        for(int i=1;i<ratings.length; i++){
            if(ratings[i]>ratings[i-1]){
                real[i] = real[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                real[i] = Math.max(real[i],real[i+1]+1);
            }
        }
        int sum =0;
        for(int j=0; j<real.length;j++){
            sum+=real[j];
        }
        return sum;
    }
}
