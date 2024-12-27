package maths;

public class MathSqrt {
    public static int mathSqrt(int n){
        if(n == 1 || n == 0)return n;
        int ans = 0;
        int low = 0;
        int high = n;

        while(low <= high){
            int mid = (low+high)/2;
            if(mid*mid < n){
                ans = mid;
                low = mid + 1 ;
            }
            else if (mid*mid > n){
                high = mid - 1;
            }

        }
        return  ans;
    }
    public static void main(String[] args) {
        int n = 80;
        System.out.println(mathSqrt(n));
    }
}
