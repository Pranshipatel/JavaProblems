// Find the freqency of elements in an integer array
package Hashing;

import java.util.HashMap;

public class FrequencyElement {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,2,2,44,6,7,4,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int key : arr){
            map.put(key, map.getOrDefault(key,0)+1);
        }

        System.out.println(map);
    }
}
