import java.util.*;
public class practice {
    public static int recur(int n){
        if(n == 0 )return 0;

        return  (n%10) + recur(n/10);
    }

    public static void main(String[] args) {
        int n = 125;
        int sum = recur(n);

        System.out.println(sum);
    }
}
