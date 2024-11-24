// size of union of array

package Hashing;

import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr1[] = {3,4,2,8};
        int arr2[]= {3,5,6,4,2,34};
        UnionArray(arr1,arr2);
    }
    public static void UnionArray(int arr1[] ,int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int key : arr1){
            set.add(key);
        }
        for(int key : arr2){
            set.add(key);
        }
        System.out.println("size "+set.size());
        System.out.println("set"+set);
    }
}
