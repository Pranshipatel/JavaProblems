//Given an integer array of size n , find all elements that appear more than [n/3] times

package Hashing;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array");
        for(int i=0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }

        MajorityElement(arr);

    }
    public static void MajorityElement(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key : arr){
            if(map.containsKey(key)){
               map.put(key, map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
}
