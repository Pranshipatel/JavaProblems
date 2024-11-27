//Print the unique elements in an array
package Hashing;

import java.util.HashMap;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,2,1,6,7,8};
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int key : arr){
            map.put(key, map.getOrDefault(key,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
