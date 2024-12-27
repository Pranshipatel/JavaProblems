package Recursion;

public class gcd1 {
    public static  int gcd(int a , int b){
        if(a == 0)return b;
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(18,24));
    }
}
