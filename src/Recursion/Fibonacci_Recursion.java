//Fibonacci Numbers  --Recursion Tree
package Recursion;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0;i<n;i++){
            System.out.println(Fibonacci(i));
        }
    }
    public static int Fibonacci(int n){
        if (n==0)return 0;
        if(n == 1)return 1;

        return Fibonacci(n-1) + Fibonacci(n-2);

    }
}
