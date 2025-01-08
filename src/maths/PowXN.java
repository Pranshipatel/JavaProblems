package maths;

public class PowXN {
    public static void main(String[] args) {
        System.out.println(pow(2.00000,13));
    }
    public static double pow(double x , int n){
        double ans = 1.0;
        long pow = n;
        if(pow < 0){
            pow = -pow;
        }

        while (pow > 0){
            if(pow % 2== 0){
                x *= x;
                pow /= 2;
            }
            else{
                ans *= x;
                pow -= 1;
            }
        }
        if(n < 1){
            ans = 1/ans;
        }
        return ans;
    }
}
