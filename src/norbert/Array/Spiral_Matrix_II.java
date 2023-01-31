package norbert.Array;

import java.util.ArrayList;

//https://leetcode.com/problems/spiral-matrix-ii/
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int[][] output= generateMatrix(3);
        for (int[] ints : output) {
            System.out.print('[');
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println(']');
        }


    }
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int loop =1;
        int start = 0;
        int end = n;

        int count = 1;
        while (loop<=n/2){
            for (int y =start;y<end-loop;y++){
                result[start][y] = count++;
            }
            for (int x =start;x<end-loop;x++){
                result[x][end-loop] = count++;
            }
            for (int y =end-loop;y>start;y--){
                result[end-loop][y] = count++;
            }
            for (int x =end-loop;x>start;x--){
                result[x][start] = count++;
            }

            loop++;
            start++;

        }
        if(n%2 ==1){
            result[start][start]=count;
        }

        return result;
    }
}
