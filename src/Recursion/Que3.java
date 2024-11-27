//Print hello n times
package Recursion;

public class Que3 {
    public static void main(String[] args) {
        int n = 10;
        Recur(n);
    }
    public static void Recur(int n){
        if(n==0)return;
        System.out.println("hello");
        Recur(n-1);
    }
}
