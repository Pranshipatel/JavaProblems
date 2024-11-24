package Hashing;

import java.util.*;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int arr1[] = {3,4,2,8};
        int arr2[]= {3,5,6,4,2,34};
        Intersection(arr1,arr2);
    }
    public static void Intersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> Newset = new HashSet<>();

        for(int key : arr1){
            set.add(key);
        }
        for(int result : arr2){
            if(set.contains(result)){
                Newset.add(result);
            }
        }
        System.out.println(Newset);
    }
}
