package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        if(Prime(number)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean Prime(int number){
        if(number <= 1)return false;
        for(int i=2;i<number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
