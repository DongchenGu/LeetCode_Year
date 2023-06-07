package norbert.Array;

//https://leetcode.com/problems/spiral-matrix-ii/description/
public class Spiral_Matrix {


    public int[][] generateMatrix(int n) {
        int [][] result = new int[n][n];
        if(n==1){
            result[0][0]=1;
            return result;
        }else{
            int left =0;
            int right = n-1;
            int val=1;
            while(left<right){
                for(int j=left;j<right;j++,val++){
                    result[left][j]=val;
                }
                for(int i=left;i<right;i++,val++){
                    result[i][right]=val;
                }
                for(int j=right; j>left; j--,val++){
                    result[right][j]=val;
                }
                for(int i=right; i>left;i--,val++){
                    result[i][left]=val;
                }
                right--;
                left++;
            }
            if(left==right){
                result[left][right]=val;
            }
        }
        return result;
    }
}
