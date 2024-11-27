package String;

import java.util.*;

public class String_Que71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        for(int i = 0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
