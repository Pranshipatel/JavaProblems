package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Remove_Duplicates {
    public static void remove(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }

        System.out.println(list.size());
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3,4};
        remove(arr);
    }

}
