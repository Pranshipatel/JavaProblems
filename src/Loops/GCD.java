// Euclidean Algorithm O(logn)
// The Euclidean Algorithm repeatedly replaces the larger number with its remainder when divided by the smaller number until the remainder becomes zero.

package Loops;

public class GCD {
    public static void main(String[] args) {
      int a = 12;
      int b = 24;
      int ans = Gcd(a,b);
      System.out.println(ans);
    }

    public static int Gcd(int a, int b) {
      while (b != 0){
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
    }

}
