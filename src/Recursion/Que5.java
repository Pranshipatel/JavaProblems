//factorial

package Recursion;

public class Que5 {
    public static void main(String[] args) {
        int n = 5;
        int fact = RecurFact(n);
        System.out.println(fact);
    }
    public static  int RecurFact(int n){
        if(n == 0 || n == 1)return 1;

        return n * RecurFact(n-1);
    }
}
