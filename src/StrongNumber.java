import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if(number == StrongNum(number)){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }

    public static int StrongNum(int number){
        int sum = 0;
        while(number > 0){
            int fact = 1;
            int rem = number % 10;
            for(int i=1;i<=rem;i++){
                fact *= i;
            }
            sum += fact;
            number /= 10;
        }
        return  sum;
    }
}
