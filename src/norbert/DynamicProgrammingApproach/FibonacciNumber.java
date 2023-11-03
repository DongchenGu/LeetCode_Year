package norbert.DynamicProgrammingApproach;

public class FibonacciNumber {
    public int fib(int n) {
        if(n<=1){return n;}
        int[] Fibonacci = new int[n+1];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        for(int i=0; i<=n; i++){
            if(i>1){
                Fibonacci[i]=Fibonacci[i-1] + Fibonacci[i-2];
            }
        }
        return Fibonacci[n];
    }
}
