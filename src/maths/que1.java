package maths;
// time complexity O(root n)

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class que1 {
    public static void main(String[] args) {
        int n = 100;
        List<Integer> factors = new ArrayList<>();

        for(int i = 1;i < n/i ;i++){
            if(n % i ==0){
                factors.add(i);
            }
        }

        for(int i =(int) Math.sqrt(n); i<= n ;i++){
            if(n % i ==0){
                factors.add(i);
            }
        }
        System.out.println(factors);
    }
}
