package Recursion;

public class GCD_Recursion {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        int ans = Recur(a,b);
        System.out.println(ans);
    }
    public static int Recur(int a , int b){
        if( b == 0)return a;
        return Recur(b, a%b);
    }
}
