import java.util.*;
public class practice {
    public static void main(String[] args) {
       int a = 12;
       int b = 24;
       int hcf = 0;
       if(a>b){
           for(int i = 1;i<=a;i++ ){
               if(a % i == 0 && b % i ==0){
                   hcf = i;
               }
           }
       }
       else if(a<b){
            for(int i = 1;i<=b;i++ ){
                if(a % i == 0 && b % i ==0){
                    hcf = i;
                }
            }
        }
        System.out.println(hcf);
    }
}
