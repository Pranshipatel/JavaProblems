// Sum of digits of a number
package Recursion;

public class Que6 {
    public static void main(String[] args) {
      int n = 120;
      int sum = DigitSum(n);
      System.out.println(sum);
    }
    public static int DigitSum(int n){
       if(n == 0)return 0;

       return (n%10)+ DigitSum(n/10);
    }
}
