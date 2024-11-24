import java.util.Scanner;

public class ArmStrong{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();
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
