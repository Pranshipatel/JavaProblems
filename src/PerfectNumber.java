import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if(PerfectNum(number)){
            System.out.println("Perfect No");
        }
        else{
            System.out.println("Not Perfect no");
        }
    }
    public static boolean PerfectNum(int number){
        int sum = 0;
        int original = number;
        for(int i=1;i<=number / 2 ; i++){
            if(number % i == 0){
                sum += i;
            }
        }
      return  sum == number;
    }
}
