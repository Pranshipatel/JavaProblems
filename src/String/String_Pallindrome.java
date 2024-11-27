package String;

import java.util.Scanner;

public class String_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        Pallin(str);
        System.out.println(Pallin(str));
    }
    public static boolean Pallin(String str){
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
           reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
}
