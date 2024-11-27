//Sum of first n natural numbers
package Recursion;

public class Que4 {
    public static void main(String[] args) {
      int n = 6;
      int sum = RecurSum(n);
        System.out.println(sum);
    }
    public static int RecurSum(int n){
      if(n == 0)return 0;

      return  n+ RecurSum(n-1);
    }
}
