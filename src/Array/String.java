package Array;

public class String {
    public static void main(String[] args) {
     int number = 153;
     if(number == armStrong(number)){
         System.out.println("yes");
     }
     else{
         System.out.println("no");
     }
    }
    public static int armStrong(int number){
        int sum = 0;
       while(number > 0){
         int rem = number %10;
         sum += rem*rem*rem;
         number /= 10;
       }
       return sum;
    }
}
